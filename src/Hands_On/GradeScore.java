package Hands_On;

import java.util.Scanner;

public class GradeScore {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Score: ");
        double score = sc.nextDouble();


        if (score >= 90 && score <= 100)
            System.out.println("GRADE: A");
        else if (score >= 80 && score < 90)
            System.out.println("GRADE: B");
        else if (score >= 70 && score < 80)
            System.out.println("GRADE: C");
        else if (score >= 60 && score < 70)
            System.out.println("GRADE: D");
        else if (score >= 0 && score < 60)
            System.out.println("GRADE: F");
        else
        System.out.println("Invalid input");
    }
}
