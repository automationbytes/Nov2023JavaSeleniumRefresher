package Day3;

public class SumofArray {
    public static void main(String[] args) {

        int numarr[] = {1,4,7,9,5,3,2};
        int sum = 0;
        for (int i = 0; i<numarr.length; i++){
            sum = sum+numarr[i];

        }

        System.out.println(sum);

        int add = 0;
        //for each
        for (int n : numarr){
            add = add + n;
        }
        System.out.println(add);
    }
}
