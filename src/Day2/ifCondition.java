package Day2;

public class ifCondition {
    public static void main(String[] args) {
        /*
        if(condition == true){
            block
        }
        else if(){
        }
        else {
            block
        }

         */

        int a = 100;
        int b = 100;

        if(a < b){
            System.out.println("A is lesser than B");
        } else if (a == b) {
            System.out.println("A is equals to B");
        } else{
            System.out.println("B is lesser than A");
        }

    }
}
