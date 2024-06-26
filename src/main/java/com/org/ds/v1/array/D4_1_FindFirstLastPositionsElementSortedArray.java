package com.org.ds.v1.array;

//https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/

// Find first and last positions of an element in a sorted array

/**
 * Given a sorted array arr[] with possibly duplicate elements, the task is to find indexes of the first and last occurrences of an element x in the given array.
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}, x = 5
 * Output : First Occurrence = 2
 * Last Occurrence = 5
 * <p>
 * Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }, x = 7
 * <p>
 * <p>
 * An efficient approach using binary search:
 * 1. For the first occurrence of a number
 * <p>
 * a) If (high >= low)
 * b) Calculate  mid = low + (high – low)/2;
 * c) If ((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
 * return mid;
 * d) Else if (x > arr[mid])
 * return first(arr, (mid + 1), high, x, n);
 * e) Else
 * return first(arr, low, (mid -1), x, n);
 * f) Otherwise return -1;
 * <p>
 * <p>
 * 2. For the last occurrence of a number
 * <p>
 * a) if (high >= low)
 * b) calculate mid = low + (high – low)/2;
 * c)if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
 * return mid;
 * d) else if(x < arr[mid])
 * return last(arr, low, (mid -1), x, n);
 * e) else
 * return last(arr, (mid + 1), high, x, n);
 * f) otherwise return -1;
 * <p>
 * Below is the implementation of the above approach:
 */
public class D4_1_FindFirstLastPositionsElementSortedArray {
    /* if x is present in arr[] then returns the index of
    FIRST occurrence of x in arr[0..n-1], otherwise
    returns -1 */
    public static int first(int[] arr, int low, int high,
                            int x, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1])
                    && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }

    /* if x is present in arr[] then returns the index of
    LAST occurrence of x in arr[0..n-1], otherwise
    returns -1 */
    public static int last(int[] arr, int low, int high,
                           int x, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == n - 1 || x < arr[mid + 1])
                    && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid - 1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;
        System.out.println("First Occurrence = "
                + first(arr, 0, n - 1, x, n));
        System.out.println("Last Occurrence = "
                + last(arr, 0, n - 1, x, n));
    }
}