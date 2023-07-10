import java.util.*;
public class hashmap {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        
        //insert
        map.put("India",100);
        map.put("dubai",101);
        map.put("france",103);

        System.out.println(map);



        //contains //search
        System.out.println(map.containsKey("Indonesia"));
        System.out.println(map.containsValue(101));

        //to get value
        System.out.println(map.get("france"));
        System.out.println(map.get("london"));

        //iteration
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey());
        }

        //remove element

        map.remove("India");
        System.out.println(map);

        //replace
        map.replace("france",120);
        System.out.println(map);

        //size
        System.out.println("the size is:"+map.size());

        //keyset()
        Set<String> keyset=map.keySet();
        System.out.println(keyset);

        //iteration of keyset
        for(String key:keyset){
            System.out.println(key); 
        }

 
    }
}
