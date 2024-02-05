package com.org.ds.v1.searching.find_kth_largest_element;

import java.io.*;
import java.util.*;

/**
 * https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/?ref=lbp
 * 
 * K largest elements in an array using Binary Search:
 * The idea is to find the Kth largest element of the array and then print all
 * the elements which are greater than or equal to Kth largest Element. The Kth
 * largest element can be found using binary search by defining a search range
 * based on the minimum and maximum values in the input array. In each iteration
 * of binary search, count the larger than the midpoint and update the search
 * range accordingly. This process continues until the range collapses to a
 * single element, which is the kth largest element.
 * 
 * Follow the given steps to solve the problem:
 * 
 * Initialize low and high to minimum and maximum element of the array denoting
 * the range within which the answer lies.
 * Apply Binary Search on this range.
 * If the selected element by calculating mid has less than K elements lesser to
 * it then increase the number that is low = mid + 1.
 * Otherwise, Decrement the high pointer, i.e high = mid.
 * The Binary Search will terminate when only one element remains in the answer
 * space that would be the Kth largest element.
 * Print all the elements which are greater than or equal to Kth largest
 * element.
 */

public class FinadKthLargestElementUsingBinarySearch {
    public static int findKthLargest(int[] arr, int n,
            int k) {
        int low = Integer.MAX_VALUE,
                high = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the
        // array
        for (int i : arr) {
            low = Math.min(low, i);
            high = Math.max(high, i);
        }

        // Perform binary search on the range of elements
        // between low and high
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            // Count the number of elements greater than mid
            // in the array
            for (int i : arr) {
                if (i > mid) {
                    count++;
                }
            }

            // If there are at least K elements greater than
            // mid, search the right half
            if (count >= k) {
                low = mid + 1;
            }
            // Otherwise, search the left half
            else {
                high = mid - 1;
            }
        }

        // Return the Kth largest element
        return high;
    }

    public static void printKLargest(int[] arr, int n,
            int k) {
        // Find the Kth largest element
        int kthLargest = findKthLargest(arr, n, k);

        // Print the K largest elements in decreasing order
        for (int i : arr) {
            if (i >= kthLargest) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 787, 1, 23 };
        int n = arr.length;
        int k = 2; // k denotes that how manylarge element we wants

        System.out.print("K largest elements:");
        printKLargest(arr, n, k);
    }
}
