package Hands_On;

import java.beans.JavaBean;
import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        removeDuplicates(str);

    }

    public static void removeDuplicates(String str1) {

        int len1=str1.length();

        String strNew="";

        for(int i=0;i<len1;i++)
        {
            boolean isduplicate= false;
            char ch= str1.charAt(i);
            for(int j=0;j<strNew.length();j++)
            {
                if (strNew.charAt(j) == ch)
                {
                    isduplicate = true;
                    break;
                }

            }

            if (isduplicate==false)
            {
                strNew+=ch;
            }
        }

        System.out.println(strNew);

    }
}
