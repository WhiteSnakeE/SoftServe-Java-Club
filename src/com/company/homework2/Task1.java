package com.company.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(number<=0) System.out.println("Incorrect value");
        else
        System.out.println("All first odd " + number + " numbers");
        System.out.println(findCountOfOddNumbers(number));
    }

    private static int findCountOfOddNumbers(int number) {
        int sum = 0;
        for (int i = 1; i < number*2;i+=2) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.println();
        System.out.print("Sum of these numbers is: ");
        return sum;
    }
}
