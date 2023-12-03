package Day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Five",5);
        map.put("Ten",10);
        map.put("Eight",8);
        map.put("One",11111);


        System.out.println(map);


        System.out.println("For using entry set");
        //for loop
        for (Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }

        System.out.println("For using key");
        //for loop wit key
        for (String k : map.keySet()){
            System.out.println(k+ " "+map.get(k));
        }

        System.out.println("For using for each");

        //using for-each in map
        map.forEach((k,v) -> System.out.println(k+ "  " + v  ));

        //Iterator
        System.out.println("For using Iterator");

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }

    }
}
