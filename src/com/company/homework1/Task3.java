package com.company.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextInt();
        System.out.print("Enter b: ");
        double b = scanner.nextInt();
        System.out.print("Enter c: ");
        double c = scanner.nextInt();
        double discriminant = findDiscriminant(a, b, c);
        System.out.println(findRoots(discriminant, a, b));
    }

    private static String findRoots(double discriminant, double a, double b) {
        double firstRoot;
        double secondRoot;
        if (discriminant > 0) {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "First root is " +  firstRoot + " second root is " +  secondRoot;
        } else if (discriminant == 0) {
            firstRoot = -b / (2 * a);
            return "Root is " + firstRoot;
        } else return "No roots";
    }

    private static double findDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
