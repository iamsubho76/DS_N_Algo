package com.org.ds.v3.lohia.array;

import java.util.Arrays;

/**
 * Question: Given an array of integers, find the number of pairs of array elements
 * that have a difference equal to the target value.
 *
 * Example:
 *
 * Input:
 * arr[ ] = {1, 2, 3, 4}
 * k = 1
 *
 * Output: 3
 *
 * https://www.youtube.com/watch?v=lGDyeD597RA&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=7
 */

public class C6_FindPairOfElementsWhoseDifferenceIsTargetVal {

  private boolean binarySearch(int[] arr, int numberToFind) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == numberToFind) return true;
      if (arr[mid] < numberToFind) left = mid + 1;
      else right = mid - 1;
    }
    return false;
  }

  public int pairs(int k, int[] arr) {

    // Sort the array with O(n log(n))
    Arrays.sort(arr);

    int result = 0;
    for (int i : arr) {
      int numberToSearch = i - k;
      if (binarySearch(arr, numberToSearch)) {
        result++;
      }
    }

    return result;
  }

}