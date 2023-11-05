package Day2;

public class ForLoop {
    public static void main(String[] args) {
        /*

        for(init; condition ; increment/decrement){

        }
        init - start
        condition - stop
        increment - step

         */

        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("**********");

        for (int i = 0; i<=100; i += 5){
            System.out.println(i);
        }

        System.out.println("*******");

        for (int i = 100; i > 0 ; i--){
            System.out.println(i);
        }
    }
}
