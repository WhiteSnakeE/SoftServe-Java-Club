package com.company.homework5;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(35);
        list.add(40);
        list.add(5);
        list.add(20);
        list.add(10);
        Double result = list.stream()
                .filter(i -> i%2!=0 && i % 5==0)
                .mapToDouble(i->i)
                .average()
                .getAsDouble();

        System.out.println(result);
    }
}
