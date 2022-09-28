package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 10 == 3) System.out.println("It's true!");
        else System.out.println("It's false");
    }
}
