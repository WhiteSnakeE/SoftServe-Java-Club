package com.company.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> a = new HashMap<>();
        a.put("Vladyslav",20);
        a.put("Samir", 21);
        a.put("Jaroslava",22);
        int result = a.entrySet()
                .stream()
                .filter(i -> i.getKey().length() < 7)
                .mapToInt(i -> i.getValue())
                .sum();
        System.out.println(result);
    }
}
