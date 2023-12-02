package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2ArrayList {
    public static void main(String[] args) {
        String[] Veg = {"Potato","Tomato","Cabbage","Carrot","Pumpkin"};

        //method1- not recommended
        List<String> list1 = Arrays.asList(Veg);
        System.out.println(list1);

      //  list1.add("Hello");
        System.out.println(list1.get(2));

        //method2
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,Veg);
        System.out.println(list2);
        list2.add("Beetroot");
        System.out.println(list2);

        //Method3
        List<String> list3 = new ArrayList<>();
        for (String v: Veg){
            list3.add(v);
        }

        System.out.println(list3);

        list3.add("Bitter gourd");
        System.out.println(list3);

    }
}
