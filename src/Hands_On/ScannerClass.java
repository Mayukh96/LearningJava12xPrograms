package Hands_On;

import java.util.Scanner;

public class ScannerClass
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name: ");
        String x=sc.nextLine();

        System.out.println("Enter Age: ");
        int y= sc.nextInt();

        System.out.println("Name: "+x);
        System.out.println("Age: "+y);

    }

}
