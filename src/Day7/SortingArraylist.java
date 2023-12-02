package Day7;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(11);
        list.add(4);
        list.add(7);

//        //sort
//        Collections.sort(list);
//        System.out.println(list);
//
//        //reverse
//        Collections.reverse(list);
//        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
