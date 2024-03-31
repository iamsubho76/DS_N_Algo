package com.org.ds.v3.lohia.array;

/**
 *
 * https://leetcode.com/problems/jump-game-ii/description/
 *
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 *
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 *
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such
 * that you can reach nums[n - 1].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1,
 * then 3 steps to the last index.
 * Example 2:
 *
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 *
 * https://www.youtube.com/watch?v=9kyHYVxL4fw&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=56
 */
public class C56_JumpGameII {

  int jump(int[] nums) {

    int totalJumps = 0;

    // destination is last index
    int destination = nums.length - 1;

    int coverage = 0, lastJumpIdx = 0;

    // Base case
    if (nums.length == 1) return 0;

    // Greedy strategy: extend coverage as long as possible
    for (int i = 0; i < nums.length; i++) {

      coverage = Math.max(coverage, i + nums[i]);

      if (i == lastJumpIdx) {
        lastJumpIdx = coverage;
        totalJumps++;

        // check if we reached destination already
        if (coverage >= destination) {
          return totalJumps;
        }
      }
    }

    return totalJumps;
  }

}