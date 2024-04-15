package com.org.ds.v1.array;

import java.util.Arrays;

public class D15_ArrangeConsecutiveMaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {1, 14, 55, 59, 61, 65, 67, 98, 102};
        // result - {102, 1, 98, 14, 67, 55, 65, 59, 61}
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int[] finalResult = new int[n];
        for(int i=0; i<(n - 1)/2; i++){
            int j = i * 2;
            finalResult[j] = arr[right];
            finalResult[j +1] = arr[left];
            left ++;
            right --;
        }

        finalResult[n -1] = arr[right];
        System.out.println(Arrays.toString(finalResult));
    }
}
