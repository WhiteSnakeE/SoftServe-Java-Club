package com.company.homework3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {5, 6, 7};
        System.out.println(Arrays.toString(concatArray(values1, values2)));
    }
    private static int[] concatArray(int[] values2, int[] values1) {
        int[] result = new int[values1.length+values2.length];
        int count = 0;
        int indexFirst = 0;
        int indexSecond = 0;
        int stopFirst = values1.length;
        int stopSecond = values2.length;
        while (count<result.length){
            if (stopFirst!=0){
                result[count] = values1[indexFirst];
                stopFirst--;
                indexFirst++;
                count++;
            }
            if(stopSecond!=0){
                result[count] = values2[indexSecond];
                stopSecond--;
                indexSecond++;
                count++;
            }
        }
        return result;
    }

}
