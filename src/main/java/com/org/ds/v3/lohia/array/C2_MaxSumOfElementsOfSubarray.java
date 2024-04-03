package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * Given an integer array nums, find the
 * subarray
 *  with the largest sum, and return its sum.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 *
 * https://www.youtube.com/watch?v=GrNSGC8Z2T0&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=3
 */
class C2_MaxSumOfElementsOfSubarray {

//  public int maxSubArray(int[] nums) {
//
//    int max_so_far = nums[0];
//    int curr_max = nums[0];
//
//    for (int i = 1; i < nums.length; i++) {
//      curr_max = Math.max(nums[i], nums[i] + curr_max);
//      max_so_far = Math.max(curr_max, max_so_far);
//    }
//
//    return max_so_far;
//  }

  public int[] maxSubArray(int[] nums) {
    int[] maxSubarray = findMaxSubarray(nums);
//    System.out.println("Maximum subarray sum: " + maxSubarraySum(nums));
//    System.out.print("Elements of maximum subarray: ");
//    for (int num : maxSubarray) {
//      System.out.print(num + " ");
//    }
    return maxSubarray;
  }

  public int[] findMaxSubarray(int[] arr) {
    int maxSum = arr[0];
    int currentSum = arr[0];
    int start = 0;
    int end = 0;
    int tempStart = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > currentSum + arr[i]) {
        tempStart = i;
        currentSum = arr[i];
      } else {
        currentSum = currentSum + arr[i];
      }

      if (currentSum > maxSum) {
        maxSum = currentSum;
        start = tempStart;
        end = i;
      }
    }

    // Extract the elements of the maximum subarray
    int[] maxSubarray = new int[end - start + 1];
    System.arraycopy(arr, start, maxSubarray, 0, end - start + 1);

    return maxSubarray;
  }

//  public int maxSubarraySum(int[] arr) {
//    int maxSum = arr[0];
//    int currentSum = arr[0];
//
//    for (int i = 1; i < arr.length; i++) {
//      currentSum = Math.max(arr[i], currentSum + arr[i]);
//      maxSum = Math.max(maxSum, currentSum);
//    }
//
//    return maxSum;
//  }
}