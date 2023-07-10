//set is an unordered and does not contain dublicate values
//hashset uses hashing mechanism
import java.util.*;
public class hashSet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        //addinng elements to the hashset
        set.add(1);
        set.add(2);
        for(int i=0;i<5;i++){
              set.add(sc.nextInt());
        }
         //contains
        System.out.println(set.contains(3));
  
        //removing element from the hashset
        set.remove(3);

        //size printing
        System.out.println("size of the set is:"+set.size());

        //printing all the elements of the hashset using iterator object
         Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
         System.out.println();

        //using for each loop
        for( int x:set){
            System.out.print(x);
        }
        System.out.println();
        
        System.out.print(set);
    }
}
