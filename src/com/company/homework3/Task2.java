package com.company.homework3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        System.out.println(Arrays.toString(moveArrayValuesToTheRight(values)));
    }
    private static int[] moveArrayValuesToTheRight(int[] values) {
        if (values.length==0) return new int[]{};
        int[] secondArray = new int[values.length];
        secondArray[0] = values[values.length-1];
        for (int i = 1; i < values.length; i++) secondArray[i] = values[i - 1];
        return secondArray;
    }
}
