package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/single-number/description/
 *
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant
 * extra space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 *
 * https://www.youtube.com/watch?v=KNOw_goVGas&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=2
 */
class C1_SingleNumber {

  public int singleNumber(int[] nums) {
    //variable to put xor result of a
    int sing = nums[0];
    for (int i = 1; i < nums.length; i++) {
      ///int[] arr = {4, 1, 2, 1, 2};
      //explanation as XOR of two similar element will yield 0,
      //so, 1 XOR 1 =0 and 4 XOR 4 =0, so together 0 XOR 0 XOR 2=2
      sing = sing ^ nums[i];
      System.out.println("sign val: " + sing + " ,for: " + nums[i]);
    }
    return sing;

  }

}