package Day7;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One",1);
        map.put("Five",5);
        map.put("Ten",10);
        map.put("Eight",8);
        map.put("One",11111);


        System.out.println(map);
    }
}
