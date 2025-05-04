package Hands_On;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Count_Vowel_Consonant {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=sc.nextLine();
        String strLow=str.toLowerCase();

        Count(strLow);

    }

    public static void Count(String strLow){

        int len=strLow.length();
        System.out.println("String length: "+len);

        int vCount=0;
        int cCount=0;

        for (int i=0;i<len;i++)
        {
            char ch=strLow.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vCount++;
            else if (ch>= 'a' && ch<= 'z')  //used to remove any other value apart from a to z; such as numeric value.
                cCount++;

        }
        System.out.println("Vowel count is: "+vCount);
        System.out.println("Vowel count is: "+cCount);

    }

}
