package Day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptions_eg {

    /*
    try - try for exceptions
    catch - if we get exceptions in try block, code wil be pushed to catch block
    finally - irrespective of try/catch finally wil b executed

    throw - define user defined exception
    throws - it will added in method signature

     */

   static void votingEligibility(int age) throws Exception {
        if (age > 18){
            System.out.println("Eligible");
        }
        else{
            throw new Exception("Not Eligible for voting");
        }
    }

    public static void main(String[] args) throws Exception {

       try{
           System.out.println("Try called");
           votingEligibility(150);
       }catch (Exception e){
           System.out.println("Catch called");
           e.printStackTrace();
       }
       finally {
           System.out.println("Finally called");
       }
//
//        //checked expections
//        FileInputStream fileInputStream = new FileInputStream("c:/1.txt");
//
////        //unchecked exception
////        int[] arr = new int[5];
////        arr[10] = 15;
//
//        String a = null;
//        System.out.println(a.length());
    }
}
