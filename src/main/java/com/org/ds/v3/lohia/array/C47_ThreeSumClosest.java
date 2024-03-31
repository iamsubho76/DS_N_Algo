package com.org.ds.v3.lohia.array;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum-closest/description/
 *
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 * You may assume that each input would have exactly one solution.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 *
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 *
 * https://www.youtube.com/watch?v=uSpJQa6MRZ8&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=48
 */
public class C47_ThreeSumClosest {

  int threeSumClosest(int[] arr, int target) {

    // Sort the elements
    Arrays.sort(arr);
    int resultSum = arr[0] + arr[1] + arr[2];
    int minDifference = Integer.MAX_VALUE;

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++) {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == target)
          return target;
        if (sum < target)
          left++;
        else
          right--;

        int diffToTarget = Math.abs(sum - target);
        if (diffToTarget < minDifference) {
          // update the result sum
          resultSum = sum;
          minDifference = diffToTarget;
        }
      }
    }
    return resultSum;
  }

}