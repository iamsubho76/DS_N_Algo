package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/description/
 *
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * https://www.youtube.com/watch?v=fikdT0AI5z4&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=35
 */

public class C34_SquaresOfSortedArray {

  int[] sortedSquares(int[] nums) {

    int[] result = new int[nums.length];

    // Square all elements
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }

    int head = 0;
    int tail = nums.length - 1;

    // Set them at right place in the result array
    for (int pos = nums.length - 1; pos >= 0; pos--) {

      if (nums[head] > nums[tail]) {
        result[pos] = nums[head];
        // Increment head pointer
        head++;
      } else {
        result[pos] = nums[tail];
        // Increment tail pointer
        tail--;
      }
    }

    return result;
  }

}