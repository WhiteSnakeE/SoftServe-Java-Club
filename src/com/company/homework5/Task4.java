package com.company.homework5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] a = {5,2,4,2,1};
        String b =
                String.valueOf(Arrays.stream(a).
                        reduce((left, right) -> Integer.parseInt(left +  "" + right)).
                        orElse(0));
        System.out.println(b);
    }
}
