package Hands_On;

import java.util.Scanner;

public class TablePrint
{

    public static void main (String[] args)
    {
        int j;
        int k=2;
        System.out.println("Table of "+k+ " is:");

        for (int i=0; i<=10; i++)
        {
            j=k*i;
            System.out.println(k+"*"+i+"="+j);
        }

    }

}
