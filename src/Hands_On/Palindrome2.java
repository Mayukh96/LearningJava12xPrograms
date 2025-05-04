package Hands_On;

import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");

        String str=sc.nextLine().toLowerCase();

        if(isPalindrome(str)==true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    public static boolean isPalindrome(String a)
    {
        int len=a.length();

        for (int i=0; i<len/2 ;i++)
        {
            char start=a.charAt(i);
            char end=a.charAt(len-1-i);

            if(start!=end)
                return false;
        }
        return true;
    }
}

