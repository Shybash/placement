
import java.util.*;
public class symmetric{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<String> set1=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            set1.add(sc.next());
        }
        
        HashSet <String> set2=new HashSet<>();
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            set2.add(sc.next());
        }
        for(String x: set2){
            if(set1.contains(x)){
                set1.remove(x);
            }
            else{
                set1.add(x);
            }
        }
        System.out.print(set1);
        }
    }
