package com.org.ds.v1.array;

//https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/
//Find the largest three distinct elements in an array

import java.util.Arrays;

/**
 * Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
 * <p>
 * Examples :
 * <p>
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
 * Output: 90, 50, 23
 * <p>
 * Method 2:
 * <p>
 * An efficient way to solve this problem is to use any O(nLogn) sorting algorithm & simply returning the last 3 largest elements.
 * <p>
 * Output
 * 54 45 23
 * <p>
 * Time Complexity: O(n log n)
 * Auxiliary Space: O(1)
 */
public class D13_FindTheLargestThreeDistinctElementsInAnArray {
    // Driver code
    public static void main(String[] args) {
        D13_FindTheLargestThreeDistinctElementsInAnArray obj = new D13_FindTheLargestThreeDistinctElementsInAnArray();
        int[] arr = {12, 45, 1, -1, 45, 54, 23, 5, 0, -10};
        obj.find3largest(arr);
    }

    void find3largest(int[] arr) {
        Arrays.sort(arr); // It uses Tuned Quicksort with
        // avg. case Time complexity = O(nLogn)
        int n = arr.length;
        int check = 0, count = 1;

        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            } else
                break;
        }
    }
}
