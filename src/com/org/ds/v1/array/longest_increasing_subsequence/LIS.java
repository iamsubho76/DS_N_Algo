package com.org.ds.v1.array.longest_increasing_subsequence;

//https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/

/**
 * Given an array arr[] of size N, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e., the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.
 *
 * LIS
 * Longest Increasing Subsequence
 *
 * Examples:
 *
 * Input: arr[] = {3, 10, 2, 1, 20}
 * Output: 3
 * Explanation: The longest increasing subsequence is 3, 10, 20
 *
 * Input: arr[] = {3, 2}
 * Output:1
 * Explanation: The longest increasing subsequences are {3} and {2}
 *
 * Input: arr[] = {50, 3, 10, 7, 40, 80}
 * Output: 4
 * Explanation: The longest increasing subsequence is {3, 7, 40, 80}
 */
// Dynamic Programming Java implementation
// of LIS problem

import java.lang.*;

class LIS {

    // lis() returns the length of the longest
    // increasing subsequence in arr[] of size n
    static int lis(int arr[], int n) {
        int lis[] = new int[n];
        int i, j, max = 0;

        // Initialize LIS values for all indexes
        for (i = 0; i < n; i++)
            lis[i] = 1;

        // Compute optimized LIS values in
        // bottom up manner
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        // Pick maximum of all LIS values
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;

        // Function call
        System.out.println("Length of lis is "
                + lis(arr, n));
    }
}
