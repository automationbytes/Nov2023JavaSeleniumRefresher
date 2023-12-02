package Day7;

import java.util.HashSet;

/*
Set will not allow duplicates
    Set can't be accessed based on Index
    Set is nt ordered
        Set can be modifiable/growable
        Set can store 1 null values
        Set can store homo/Hetro data



HashSet- Hashset will not be ordered (Insertion order not maintained)
LinkedHashSet - Insertion Order will be maintained
TreeSet - Sorted Set

 */
public class SetInterface {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add(4);
        set.add(44);
        set.add(43);
        set.add(41);
        set.add(14);
        set.add(4);

        System.out.println(set);

        HashSet set1 = (HashSet) set.clone();
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);

        System.out.println(set.size());


        System.out.println(set.contains(41));

        set.remove(41);
        System.out.println(set);
    }
}
