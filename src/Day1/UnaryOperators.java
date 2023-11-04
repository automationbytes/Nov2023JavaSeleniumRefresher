package Day1;

public class UnaryOperators {
    public static void main(String[] args) {
        //increment Operator
        int i = 10;
        /*
        i++ - Assignment then incrementation
        ++i - incrementation then Assignment

         */
        System.out.println(i++);
        System.out.println(i);

        int j = 10;
        System.out.println(++j); //11
        System.out.println(j);


        //decrement operator
        System.out.println(i--); //11
        System.out.println(i);//10
    }
}
