package Day7;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DesMap {
    public static void main(String[] args) {
        NavigableMap<Object, Object> map = new TreeMap<>().descendingMap();
        map.put("One",1);
        map.put("Five",5);
        map.put("Ten",10);
        map.put("Eight",8);
        map.put("One",11111);


        System.out.println(map);
    }
}
