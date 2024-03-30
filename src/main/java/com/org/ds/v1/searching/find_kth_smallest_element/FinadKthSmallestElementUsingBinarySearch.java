package com.org.ds.v1.searching.find_kth_smallest_element;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/?ref=lbp
 * K’th smallest element in an unsorted array using Binary Search on Answer:
 * To find the kth smallest element using binary search on the answer, we start
 * by defining a search range based on the minimum and maximum values in the
 * input array. In each iteration of binary search, we count the elements
 * smaller than or equal to the midpoint and update the search range
 * accordingly. This process continues until the range collapses to a single
 * element, which is the kth smallest element.
 * 
 * Follow the given steps to solve the problem:
 * 
 * Intialize low and high to minimum and maximum element of the array denoting
 * the range within which the answer lies.
 * Apply Binary Search on this range.
 * If the selected element by calculating mid has less than K elements lesser to
 * it then increase the number that is low = mid + 1.
 * Otherwise, Decrement the high pointer, i.e high = m
 */
public class FinadKthSmallestElementUsingBinarySearch {
    static int count(int[] nums, int mid) {
        // function to calculate number of elements less
        // than equal to mid
        int cnt = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] <= mid)
                cnt++;

        return cnt;
    }

    static int kthSmallest(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        // calculate minimum and maximum the array.
        for (int i = 0; i < nums.length; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }
        // Our answer range lies between minimum and maximum
        // element of the array on which Binary Search is
        // Applied
        while (low < high) {
            int mid = low + (high - low) / 2;
            /*
             * if the count of number of elements in the
             * array less than equal to mid is less than k
             * then increase the number. Otherwise decrement
             * the number and try to find a better answer.
             */
            if (count(nums, mid) < k)
                low = mid + 1;

            else
                high = mid;
        }

        return low;
    }

    // Driver's code
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 3, 19, 3 };
        int k = 3;

        // Function call
        System.out.print("Kth smallest element is "
                + kthSmallest(arr, k));
    }
}
