package com.company.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) System.out.println("Incorrect value");
        else
            System.out.print("This value is prime? : ");
            System.out.println(isThisNumberIsPrime(number));
    }

    private static boolean isThisNumberIsPrime(int number) {
        for (int i = 2; i < number; i++) for (int j = 2; j < i; j++) if (number % j == 0) return false;
        return true;
    }
}
