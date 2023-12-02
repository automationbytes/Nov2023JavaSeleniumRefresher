package Day7;

import java.util.HashMap;

public class HashMap_eg {
    public static void main(String[] args) {
        /*
        Key and value pair

        Key - set
        Value - List

        HashMap - Random order
        LinkedHashMap - Insertion order
        TreeMap - Sorted Order

         */

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Five",5);
        map.put("Ten",10);
        map.put("Eight",8);
        map.put("One",11111);


        System.out.println(map);

        System.out.println(map.size());

        //contains
        System.out.println(map.containsKey("One"));

        //contains
        System.out.println(map.containsValue(10));

        //replace
        System.out.println(map.getOrDefault("Eight",9));
        System.out.println(map);

        map.replace("Five",5000);
        System.out.println(map);

        map.remove("Five");
        System.out.println(map);



    }
}
