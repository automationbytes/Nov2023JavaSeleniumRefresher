package Day3;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int numarr[] = {1,4,7,9,5,3,2};
        int temp = 0;
        for (int i = 0; i<numarr.length; i++){
            for (int j= i+1;j<numarr.length;j++){
                if (numarr[i] > numarr[j]){
                    temp = numarr[i];
                    numarr[i]= numarr[j];
                    numarr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numarr));

        //find smallest number
        System.out.println(numarr[0]);

        //find 2nd smallest number //arr[n-1] where n is the 2nd,3rd value which yu are gonna find
        System.out.println(numarr[2-1]);

        //largest number
        System.out.println(numarr[numarr.length-1]);

        //2nd largest num //numarr[numarr.length-n]
        System.out.println(numarr[numarr.length-2]);

    }
}
