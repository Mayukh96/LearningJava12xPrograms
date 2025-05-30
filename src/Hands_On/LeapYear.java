package Hands_On;

import java.util.Scanner;

public class LeapYear {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        boolean isLeapYear= (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if  (isLeapYear)
            System.out.println(year+" is a Leap Year");
        else
            System.out.println(year+" is not a Leap Year");
    }
}
