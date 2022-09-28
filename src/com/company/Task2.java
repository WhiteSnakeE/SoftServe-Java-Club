package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0 || a > 10) System.out.println("Не відповідає умові завдання!");
        else if (a > 1 && a < 5) System.out.println(a + " гривні");
        else if (a == 1) System.out.println(a + " гривня");
        else System.out.println(a + " гривень");
    }

}
