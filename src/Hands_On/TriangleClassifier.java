package Hands_On;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Side 1 length: ");
        double side1 = sc.nextDouble();

        System.out.println("Side 1 length: ");
        double side2 = sc.nextDouble();

        System.out.println("Side 1 length: ");
        double side3 = sc.nextDouble();

        if (side1==side2 && side2==side3)
            System.out.println("Equilateral Triangle");
        else if (side1==side2 || side1==side3 ||side2==side3)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }


}