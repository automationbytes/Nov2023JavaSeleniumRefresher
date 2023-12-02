package Day7;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("One",1);
        map.put("Five",5);
        map.put("Ten",10);
        map.put("Eight",8);
        map.put("One",11111);


        System.out.println(map);
    }
}
