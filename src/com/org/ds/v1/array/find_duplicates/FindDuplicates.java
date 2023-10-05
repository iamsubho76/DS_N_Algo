package com.org.ds.v1.array.find_duplicates;

import java.util.ArrayList;
import java.util.List;


//Find duplicates in O(n) time and O(1) extra space | Set 1

/**
 * Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and use only constant memory space.
 * <p>
 * Note: The repeating element should be printed only once.
 * <p>
 * Example:
 * <p>
 * Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
 * Output: 1, 3, 6
 * Explanation: The numbers 1 , 3 and 6 appears more than once in the array.
 * <p>
 * <p>
 * Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
 * Output: 3
 * Explanation: The number 3 appears more than once in the array.
 * <p>
 * Apprach 2:
 * Use the input array to store the frequency of each element. While Traversing the array, if an element x is encountered then increase the value of x%n‘th index by n. The original value at ith index can be retrieved by arr[i]%n and frequency can be retrieved by dividing the element by n.
 * <p>
 * Follow the steps to implement the approach:
 * <p>
 * Traverse the given array from start to end.
 * For every element in the array increment the element arr[i] by n.
 * Now traverse the array again and store all those indexes i for which arr[i]/n is greater than 1. Which guarantees that the number has appeared more than once.
 * Since, the values are getting modified, the original value at ith index can be retrieved by arr[i]%n.
 * Below is the implementation of above approach:
 */

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int n = arr.length;

        // First check all the values that are present in
        // the array then go to those values as indices and
        // increment by the size of the array
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more than once by
        // dividing with the size of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                duplicates.add(i);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 1, 3, 6, 6};

        System.out.println("The repeating elements are: ");
        List<Integer> ans = findDuplicates(arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
