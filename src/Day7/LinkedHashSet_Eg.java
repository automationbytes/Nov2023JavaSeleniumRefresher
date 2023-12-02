package Day7;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Eg {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(4);
        set.add(44);
        set.add(43);
        set.add(41);
        set.add(14);
        set.add(4);

        System.out.println(set);

    }
}
