package com.org.ds.v1.array.sort_0s_1s_2s;
//https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/?ref=roadmap

// Java program to sort an array of 0, 1 and 2

import java.io.*;

/**
 * Sort an array of 0s, 1s, and 2s using the Pointer Approach:
 * This approach is based on the following idea:
 * <p>
 * The problem is similar to “Segregate 0s and 1s in an array”.
 * The problem was posed with three colors, here `0′, `1′ and `2′. The array is divided into four sections:
 * arr[1] to arr[low – 1]
 * arr[low] to arr[mid – 1]
 * arr[mid] to arr[high – 1]
 * arr[high] to arr[n]
 * If the ith element is 0 then swap the element to the low range.
 * Similarly, if the element is 1 then keep it as it is.
 * If the element is 2 then swap it with an element in high range.
 * Illustration:
 * <p>
 * arr[] = {0, 1, 2, 0, 1, 2}
 * <p>
 * lo = 0, mid = 0, hi = 5
 * <p>
 * <p>
 * <p>
 * <p>
 * Step – 1: arr[mid] == 0
 * <p>
 * swap(arr[lo], arr[mid])
 * lo = lo + 1 = 1
 * mid = mid + 1 = 1
 * arr[] = {0, 1, 2, 0, 1, 2}
 * <p>
 * <p>
 * <p>
 * Step – 2: arr[mid] == 1
 * <p>
 * mid = mid + 1 = 2
 * arr[] = {0, 1, 2, 0, 1, 2}
 * <p>
 * <p>
 * <p>
 * Step – 3: arr[mid] == 2
 * <p>
 * swap(arr[mid], arr[hi])
 * hi = hi – 1 = 4
 * arr[] = {0, 1, 2, 0, 1, 2}
 * <p>
 * <p>
 * <p>
 * Step – 4: arr[mid] == 2
 * <p>
 * swap(arr[mid], arr[hi])
 * hi = hi – 1 = 3
 * arr[] = {0, 1, 1, 0, 2, 2}
 * <p>
 * <p>
 * <p>
 * Step – 5: arr[mid] == 1
 * <p>
 * mid = mid + 1 = 3
 * arr[] = {0, 1, 1, 0, 2, 2}
 * <p>
 * <p>
 * <p>
 * Step – 6: arr[mid] == 0
 * <p>
 * swap(arr[lo], arr[mid])
 * lo = lo + 1 = 2
 * mid = mid + 1 = 4
 * arr[] = {0, 0, 1, 1, 2, 2}
 * <p>
 * Hence, arr[] = {0, 0, 1, 1, 2, 2}
 * <p>
 * Follow the steps below to solve the given problem:
 * <p>
 * Keep three indices low = 1, mid = 1, and high = N and there are four ranges, 1 to low (the range containing 0), low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
 * Traverse the array from start to end and mid is less than high. (Loop counter is i)
 * If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
 * If the element is 1 then update mid = mid + 1
 * If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed
 * Print the array.
 */
class countzot {

    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sort012(int[] a, int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int[] arr, int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr, arr_size);
        printArray(arr, arr_size);
    }
}
/*This code is contributed by Devesh Agrawal*/
