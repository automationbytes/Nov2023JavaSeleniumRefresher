package Day1;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 11;     //1011 8+0+2+1    //   16 8 4 2 1
        int b = 7;      //0111 0+4+2+1
                        //0011 0+0+2+1 and
                        //1111  8+4+2+1 or
        System.out.println(a & b);
        /*
        XAnd Operator
        1 and 1 = 1
        1 and 0 = 0
        0 and 1 = 0
        0 and 0 = 0

        XOR
        1 or 1 = 1
        1 or 0 = 1
        0 or 1 = 1
        O or 0 = 0
                 */

        System.out.println(a | b);
    }
}
