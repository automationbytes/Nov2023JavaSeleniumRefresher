package Day1;

public class LogicalOperator {

    /*
    And
    ---
    True and True - True
    True and False = False
    False and True - False
    False and False - False

     */
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 1;

        System.out.println(a>b && a>c);


        System.out.println(a>b || a>c);

        /*
        Or - ||
        true or true = true
        true or false = true
        false or true = true
        false or false = false

         */

        /*

        Not -

        true = false
        false - true
         */

        System.out.println(!(a==b));
    }
}
