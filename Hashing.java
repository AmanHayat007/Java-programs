import java.security.Key;
import java.util.*;

public class Hashing {
    public static void main(String args[]){
    HashMap<String,Integer>map = new HashMap<>();
    map.put("India",120);
    map.put("China", 180);
    map.put("US",40);
    
    System.out.println(map); 

    // // search
    // if (map.containsKey("Africa")){
    //     System.out.println("Key is present in the map");
    // }else{
    //     System.out.println("Key is not present in the map");
    // }

    // To get function

    // System.out.println(map.get("Africa"));

        // iteration using entryset
        
        // for(Map.Entry<String,Integer> e : map.entrySet()){
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }


        // iteration using keyset

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(keys + " " + map.get(key));
        }


    }
}
