package Hands_On;

import java.util.Scanner;

public class Palindrome
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String input = sc.nextLine();

        String removePunctuations = input.replaceAll("\\p{Punct}", "");
        System.out.println(removePunctuations);

        String  removeSpace= removePunctuations.replaceAll("\\s+", "");
        System.out.println(removeSpace);

        System.out.println("*****************************");

        String refined = removeSpace.toLowerCase();
        System.out.println("Refined String: "+refined);

        int refinedLength=refined.length();

        String refinedReverse="";

       for (int i=refinedLength-1;i>=0; i--) {
            refinedReverse+= refined.charAt(i);
        }
        System.out.println("Reverse String: "+refinedReverse);

        System.out.println("*****************************");

       if(refinedReverse.equals(refined))
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");



    }

}

// INPUT +VE TEST: M !@#$%^&*(()_+{}[]||\;:"'<>? A DAM
// INPUT -VE TEST: M !@#$%^&*(()_+{}[]||\;:"'<>? A DAM0