package Day7;

import java.util.*;

public class Looping {
    public static void main(String[] args) {

        String[] Veg = {"Potato","Tomato","Cabbage","Carrot","Pumpkin"};

        //method2
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,Veg);
        System.out.println(list2);
        list2.add("Beetroot");
        System.out.println(list2);

        for (String a : list2){
            System.out.println(a);
            if(a.equals("Carrot")){
           //     list2.remove(a);
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).equals("Carrot")){
                list2.remove(i);
            }
        }
        System.out.println(list2);


        //Iterator
        ListIterator<String> listIterator = list2.listIterator();
        while (listIterator.hasNext()){
            if (listIterator.next().equals("Pumpkin")){
                listIterator.remove();
            }
        }
        System.out.println(list2);

        list2.removeIf(e ->e.equals("Tomato"));
        System.out.println(list2);
    }


}
