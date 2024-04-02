package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/description/
 *
 * Given an integer array nums, return the length of the longest strictly increasing
 * subsequence
 * .
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Example 2:
 *
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 *
 * https://www.youtube.com/watch?v=Xq3hlMvhrkE&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=59
 */
// Used DP Memorization
public class C59_LongestIncreasingSubsequence {

  int lengthOfLIS(int[] nums) {
    
    int[] T = new int[nums.length];

    // Start main pointer
    for (int i = 1; i < nums.length; i++)

      // Start second pointer
      for (int j = 0; j < i; j++)
        if (nums[i] > nums[j])
          if (T[j] + 1 > T[i])
            T[i] = T[j] + 1;

    // find the max value
    int maxIndex = 0;
    for (int i = 0; i < T.length; i++)
      if (T[i] > T[maxIndex])
        maxIndex = i;

    return T[maxIndex] + 1;
  }
}