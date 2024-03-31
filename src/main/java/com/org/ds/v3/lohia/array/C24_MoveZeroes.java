package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/move-zeroes/description/
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 * https://www.youtube.com/watch?v=k5lIW5XxC7g&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=25
 */
class C24_MoveZeroes {

  public void moveZeroes(int[] nums) {

    // Start with the first position
    int insertPosition = 0;

    for (int i = 0; i < nums.length; i++) {
      // FIll all non-zero numbers
      if (nums[i] != 0) {
        nums[insertPosition] = nums[i];
        insertPosition++;
      }
    }

    while (insertPosition < nums.length) {
      nums[insertPosition++] = 0;
    }
  }

}