package Day3;

import java.util.Arrays;

/*

Array refers to data Structure
One variable with multiple values
Array will b generally used to store same datatype (primitive)
Array are fixed in size (disadv)
Array can hav duplicate value
Array can be accessed wit index values

 */
public class Array_Eg {
    public static void main(String[] args) {
        int[] arr = new int[5]; //total values to be stored is 5
        //int arr[] = new int[5];
        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =2;
        arr[4] =1;
       // arr[5]=10;

        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1,2,3,2,1};//5
        System.out.println(Arrays.toString(arr1));
//arr1[5] = 10;

        String[] arr2 = {"1","2","3","2","1"};//5

        String[] fruits = {"Apple","Mango","Pineapple","Banana","Stawberry"};
        System.out.println(Arrays.toString(fruits));

        //length
        System.out.println(arr.length);

        //forloop
        for (int i =0; i< fruits.length;i++){
            System.out.println(fruits[i]);
        }

        //for each - extended for
        for(String f : fruits){
            System.out.println(f);
        }

        for (int a : arr){
            System.out.println(a);
        }

    }
}
