package Day2;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        int num = 1234; //4321
        int reversed = 0;

        while (num != 0){
            int digit = num % 10; // 4   3
            reversed = reversed * 10 + digit; //0*10+4; 4*10 +3;
            num = num/10;
        }
        System.out.println(reversed);

    }
}
