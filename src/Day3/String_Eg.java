package Day3;

import java.util.Arrays;

/*

String - used to store group of chars
String with ""

Literal Way - String pool memory
New Keyword way - Heap memory

 */
public class String_Eg {
    public static void main(String[] args) {

        String a = "Apple"; //#123
        String b = "Apple"; //#123
        String c = new String("Apple"); //new keyword - heap memory # 789
        String d = new String("apple"); //#564

        // == -> check value and the memory
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);

        //equals - just check the value matches are not
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        //equals ignore case
        System.out.println(a.equalsIgnoreCase(d));

        //compareTo
        String e = "abcd"; //97 98 99 100
        String f = "abcf"; //97 98 99 102
        System.out.println(e.compareTo(f));

        //compareTo ignore case
        String e1 = "abcd"; //97 98 99 100
        String f1 = "ABCD"; //65 66 67 68

        System.out.println(e1.compareTo(f1));
        System.out.println(e1.compareToIgnoreCase(f1));

        //length
        System.out.println(e1.length());

        //starts-with
        String h = "Hello"; //H-0;e-1;l-2..
        System.out.println(h.startsWith("He"));

        System.out.println(h.endsWith("o"));

        System.out.println(h.contains("ll"));

        //index
        System.out.println(h.indexOf("l")); //first l index
        //charAt
        System.out.println(h.charAt(0));

        //last index
        System.out.println(h.lastIndexOf("l"));

        System.out.println(h.indexOf("e",2));

        //concat
        String i = "Ice";
        String j = "Juice";
        System.out.println(i.concat(j));
        System.out.println(i + j);

        String num1 = "2";
        String num2 = "5";
        System.out.println(num1.concat(num2));
        System.out.println(num1+num2);

        //replace
        System.out.println(j.replace("m","E"));

        //split
        String k = "Kite is flying high"; //kite 0 is 1..
        String[] arr = k.split(" ");
        System.out.println(arr);//memory
        System.out.println(arr[0]);//kite
        System.out.println(Arrays.toString(arr));//print all the values of array

        //trim - cut the whitespaces
        String l = "  Love my country         ";
        System.out.println(l.trim());

        //Strip
        System.out.println(l.strip());//same like trim - 11

        System.out.println(l.stripLeading()); //left side
        System.out.println(l.stripTrailing()); //right side

        //upper
        String m = "Monkey";
        System.out.println(m.toUpperCase());
        System.out.println(m.toLowerCase());

        String n = "No one is good";
        System.out.println(n.substring(3,6));

        String o = "Orange";
        char[] carr = o.toCharArray();
        System.out.println(Arrays.toString(carr));

        String z = "100";
        int y = 200;

        System.out.println(Integer.parseInt(z)+y);
        System.out.println(Integer.valueOf(z)+y);

        System.out.println(y+z);





    }
}
