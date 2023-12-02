package Day7;

import java.util.ArrayList;

public class ArrayList_Eg {
    public static void main(String[] args) {
        /*
        List can be accessed based on Index
        List are ordered
        List allow duplicates

        List can be modifiable/growable
        List can store null values
        List can store homo/Hetro data

        Arraylist
        ---------
        Initial Capacity of Arraylist - 10
        New capacity - (Current Capacity * 3/2) +1
        for eg: 10*3/2 + 1 = 30/2+1 = 16
                16*3/2 + 1 = 48/2 +1 = 25
         */

        ArrayList al = new ArrayList(3);//3*3/2+1== 5
        al.add(1);
        al.add(5);
        al.add("Hello");
        al.add(10);

        System.out.println(al);

        //size
        System.out.println(al.size());
        al.add(3,"World");
        System.out.println(al);

        //add all - loop

        //clone - used to replicate the same values to new one
        ArrayList al1 = (ArrayList) al.clone();
        System.out.println(al1);

        al.remove("Hello");

        ArrayList al2 = al;
        System.out.println(al2);

        System.out.println(al1);
        System.out.println(al2);

        //remove by value
        al1.remove("World");
        System.out.println(al1);

        //remove by index
        al1.remove(2);
        System.out.println(al1);


        //clear
        al1.clear();
        System.out.println(al1);

        System.out.println(al);
        //contains
        System.out.println(al.contains("World"));


        //index of
        System.out.println(al.indexOf("World"));

        //get
        System.out.println(al.get(2));

        //set - update
        al.set(2,"Rain");
        System.out.println(al);
    }
}
