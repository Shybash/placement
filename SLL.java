import java.util.*;
class Node{
    int data;
    Node next;

    Node(int d){
        this.data=d;
        this.next=null;
    }
}

class SLL{
    Node head;
    int length=0;
    //add first

     public void insert(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        length++;
     }

     //del front
     public void deleteNode(int val){
        Node temp=head;
        if(head.data==val){
            head=head.next;
            length--;
        }else{
        while(temp.next!=null && temp.next.data!=val){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("element is not found:");
        }else{
            temp.next=temp.next.next;
            length--;
        }
         
     }
    }
     //print list
     public void display(){
        if(head==null){
            System.out.println("empty list");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
     }

     //reverse list
     public void reverseList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node prevNode=head;
        Node currNode=head.next;

        while(currNode!=null){
           Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
     }

     //delete nth node from last
     public Node removeNthNode(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        } 
        //size==n
        if(size==n){
        
            return head.next;
        }
        else{
            int searchIndex=size-n;
            Node prev=head;
            int i=1;
            while(i<searchIndex){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return head;
        }
         
     }
     //detecting a loop in list
     public boolean hasCycle(){
        if(head==null){
            return false;
        }
        Node hare=head;
        Node turtle=head;

        while(hare !=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
     }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        SLL l=new SLL();
        while(true){
        System.out.print("1.create\n2.display \n3.delete\n4.reverse\n5.exit\n6.remove Nth Node fromlast\n7.detect cylcle\n");
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("enter the element to insert:");
                   int d=sc.nextInt();
                   l.insert(d);
                   break;
            case 2:l.display();
            break;
            case 3:System.out.println("enter an element to delete:");  
                   int val=sc.nextInt();
                   l.deleteNode(val);
                   break;
            case 4:l.reverseList();
            break;
            case 5:System.exit(0);  
            break;
            case 6:System.out.println("enter the element to delete:");
                   int n=sc.nextInt();
                   l.removeNthNode( n);
            case 7:
            
            l.hasCycle();
        }
        System.out.println();
        
     }
    }


}