package Day7;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Descending {
    public static void main(String[] args) {
        NavigableSet set = new TreeSet().descendingSet();
        set.add(4);
        set.add(44);
        set.add(43);
        set.add(41);
        set.add(14);
        set.add(4);

        System.out.println(set);
    }
}
