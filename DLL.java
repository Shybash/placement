import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class DLL {
    Node head=null;
    Node tail=null;
    int len=0;
    public  void create(int d){
        Node newNode=new Node(d);
        Node temp=head;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        len++;
    }
     public void deleteNode(int val){
        Node temp=head;
        if(head.data==val){
            head=temp.next;
            if(head!=null){
                head.prev=null;
            }
            len--;
        }
        if(tail.data==val){
            tail=tail.prev;
            if(tail!=null){
                tail.next=null;
            }
            len--;
        }
        else{
            while(temp!=null && temp.data!=val){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("element not found:");
            }
            else{
                temp.prev.next=temp.next;
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                }
                len--;
            }
        }
     }

    void forwad_display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }    
    }
    void lenIs(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("the length of the lis is:"+count);
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        DLL l=new DLL();
        while(true){
        System.out.print("1.create\n2.display \n3.delete\n4.length\n5.exit");
        System.out.println();

        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("enter the element to insert:");
                   int d=sc.nextInt();
                   l.create(d);
                   break;
            case 2:l.forwad_display();
            break;
            case 3:System.out.println("enter an element to delete:");  
                   int val=sc.nextInt();
                   l.deleteNode(val);
                   break;
            case 4:l.lenIs();
            break;
            case 5:System.exit(0);  
        }
        System.out.println();
        
     }
    }


}
