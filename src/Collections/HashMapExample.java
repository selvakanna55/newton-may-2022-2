package Collections;

import java.util.*;

public class HashMapExample {

//    // print all the student name
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());

    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        //{<Newton, 95>}
        hm.put("Newton",95.5); // insert, update
        hm.put("ABC",95.5); // insert, update
        hm.put("MNO",66.4); // insert, update
        // if key is not there it will create new entry
        // if key is present, it wil update
        System.out.println(hm);
        hm.put("Newton", 100.0); // insert, update
        System.out.println(hm);
//        System.out.println(hm.get("MNO")); //get the value for given key -> O(1)

        for(String name:hm.keySet()){
            System.out.println(name+" "+hm.get(name));
        }
    }
}
