package Hands_On;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Input String");
        String str= sc.nextLine();

        StrReverse(str);

    }

    public static void StrReverse(String str1)
    {
        String strRev="";
        int len=str1.length();

        for (int i=len-1; i>=0;i--)
        {
            strRev+=str1.charAt(i);
        }
        System.out.println("Reversed String: "+strRev);
        if (str1.equals(strRev))
            System.out.println("String & String Reverse both are: Matching");
        else
            System.out.println("String & String Reverse both are: Not Matching");
    }
}
