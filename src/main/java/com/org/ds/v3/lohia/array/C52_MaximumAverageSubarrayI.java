package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 *
 * Input: nums = [5], k = 1
 * Output: 5.00000
 *
* https://www.youtube.com/watch?v=56TxHMG0qhQ&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=53
 */

// sliding window
public class C52_MaximumAverageSubarrayI {

  double findMaxAverage(int[] nums, int k) {

    // Get sum for starting window
    int sum = 0;
    for (int i = 0; i < k; i++)
      sum += nums[i];

    int maxSum = sum;

    // Start sliding window
    int startIndex = 0;
    int endIndex = k;
    while (endIndex < nums.length) {

      sum -= nums[startIndex]; // Remove previous element
      startIndex++;

      sum += nums[endIndex]; // Add next element
      endIndex++;

      maxSum = Math.max(maxSum, sum); // Update max sum
    }

    // Return the average
    return (double) maxSum / k;
  }
}