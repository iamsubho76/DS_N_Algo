package com.org.ds.v1.array;

/**
 * This code will output the maximum sum of a subarray in the array {-2, 1, -3, 4, -1, 2, 1, -5, 4},
 * which is 6 (corresponding to the subarray {4, -1, 2, 1}).
 * You can replace the array with your own values as needed.
 */
public class D16_SlidingWindowMaxSumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            currentSum += nums[right];
            maxSum = Math.max(maxSum, currentSum);

            // If current sum becomes negative, reset it and move the window
            if (currentSum < 0) {
                currentSum = 0;
                left = right + 1;
            }

            right++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum sum of subarray: " + maxSum);
    }
}
