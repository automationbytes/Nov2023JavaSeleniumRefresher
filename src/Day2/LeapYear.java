package Day2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       // int year = 2024;

        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter to year to find: ");

        int year = myobj.nextInt();

      //  String a = myobj.nextl

        if(year % 4 == 0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}


