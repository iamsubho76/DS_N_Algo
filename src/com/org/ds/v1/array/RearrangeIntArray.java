package com.org.ds.v1.array;

import java.util.Arrays;

public class RearrangeIntArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 45, 65, 80};
        int[] rearrangedaray = new int[array.length];
        rearrangeArray(array, rearrangedaray);

        System.out.println("Rearranged Array: " + Arrays.toString(rearrangedaray));
    }

    private static void rearrangeArray(int[] array, int[] rearrangedaray) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            // Swap the ith element with the (length - i - 1)th element
            int temp = array[length -i];
            rearrangedaray[i] = array[length - i - 1];
            rearrangedaray[i + 1] = temp;
        }
    }
}
