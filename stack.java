import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class stack {
     public static Node head;
     int length=0;
    public static boolean isEmpty(){
        return head==null;
    }
    //push
    public void push(int d){
        Node newNode=new Node(d);
        if(head==null){
           head=newNode;
           return;
        }
        newNode.next=head;
        head=newNode;
    }
    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        Node top=head;
        head=head.next;
        return top.data;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        Node top=head;
        return top.data;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        while(true){
         System.out.print("1.push\n2.peek \n3.pop\n4.exit\n");
          int ch=sc.nextInt();

          switch(ch){
               case 1:System.out.println("enter the element :");
               int d=sc.nextInt();
               s.push(d);
               break;
               case 2:System.out.println(s.peek());
               break;
               case 3:System.out.println(s.pop());
               break;
               case 4:System.exit(0);
          }
        }
    }
}
