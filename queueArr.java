import java.util.*;
public class queueArr {
    static int front;
    static int rear;
    static int n=10;
    static int arr[]=new int[n];
     queueArr(){
            front=rear=-1;
        }

        public static void enqueue(int d){
            if(rear==n-1){
                System.out.println("queue overflow");
            }
            rear++;
            arr[rear]=d;
            if(front==-1){
                front++;
            }
        }
        public static void dequeue(){
            if(front==-1 || front>rear){
                System.out.println("queue underflow");
            }
            front++;
        }
        public static int peek(){
            if(front==-1 || front>rear){
                System.out.println("queue underflow");
                return -1;
            }
            return arr[front];
        }
        public static void display(){
            if(rear==-1){
                System.out.println("queue underflow");
            }

            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       queueArr q=new queueArr();
       while(true){
        System.out.println("\n1.enueue\n2.display\n3.dequeue\n4.peek\n5.exit\nenter a choice:");
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("enter a element:");
            int d=sc.nextInt();
            q.enqueue(d);
            break;
            case 2:q.display();
            break;
            case 3:q.dequeue();
            break;
            case 4:System.out.println("the front element is:"+q.peek());
            break;
            case 6:System.exit(0);
        }
    }

}

    }

