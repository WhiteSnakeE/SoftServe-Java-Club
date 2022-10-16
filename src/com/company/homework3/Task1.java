package com.company.homework3;

public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2};
        System.out.println(findSumOfElementsBetweenMaxAndMinValues(values));
    }

    private static int findSumOfElementsBetweenMaxAndMinValues(int[] values) {
        if (values.length <= 2) return 0;
        int sum = 0;
        int min = values[0];
        int max = values[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                minIndex = i;
            } else if (values[i] > max) {
                max = values[i];
                maxIndex = i;
            }
        }
        System.out.println("max index " + maxIndex);
        System.out.println("min index " + minIndex);
        for (int i = minIndex; i < maxIndex; i++) sum += values[i];
        return sum;
    }
}
