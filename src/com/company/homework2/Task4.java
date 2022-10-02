package com.company.homework2;

public class Task4 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 0;
        double sum = 0;
        double averageValue;
        for (int i = 0; i < 10; i++) {
            firstNumber += secondNumber;
            System.out.print(firstNumber + " ");
            secondNumber += firstNumber;
            System.out.print(secondNumber + " ");
            sum+= secondNumber + firstNumber;
        }
        System.out.println();
        averageValue = sum/20;
        System.out.println("The average is: " + averageValue);
    }
}
