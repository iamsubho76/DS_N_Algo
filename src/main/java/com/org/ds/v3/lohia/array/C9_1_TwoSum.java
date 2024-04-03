package com.org.ds.v3.lohia.array;

import java.util.*;

/**
 * https://leetcode.com/problems/two-sum/description/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * https://www.youtube.com/watch?v=7jDS9KQEDbI&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=10
 */

// best way to solve using Two-Pointer, instead of other approaches
class C9_1_TwoSum {

  int[] twoSumBruteForce(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] + nums[j] == target)
          return new int[]{i, j};
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }


  public int[] twoSumUsingTwoPointer(int[] input, int target) {
    Arrays.sort(input);
    int i = 0, j = input.length - 1;
    while (i < j) {
      int diff = target - (input[i] + input[j]);
      if (diff < 0)
        j--;
      else if (diff > 0)
        i++;
      else
        return new int[]{i, j};
    }
    return new int[]{-1, -1};
  }

  int[] twoSumSorting(int[] nums, int target) {
    int[] copyArray = Arrays.copyOf(nums, nums.length);
    Arrays.sort(copyArray);

    int head = 0;
    int tail = copyArray.length - 1;
    int num1 = 0, num2 = 0;
    while (head < tail) {
      int sum = copyArray[head] + copyArray[tail];
      if (sum < target) {
        head++;
      }
      else if (sum > target) {
        tail--;
      } else {
        num1 = copyArray[head];
        num2 = copyArray[tail];
        break;
      }
    }

    // Create the result array with indices
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == num1) result[0] = i;
      if (nums[i] == num2) result[1] = i;
    }
    return result;
  }

  int[] twoSumHashing(int[] nums, int target) {

    // Create a HashMap
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      // Get the complement using the target value
      int complement = target - nums[i];

      // Search the hashmap for complement, if found, we got our pair
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }

      // Put the element in hashmap for subsequent searches.
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

}