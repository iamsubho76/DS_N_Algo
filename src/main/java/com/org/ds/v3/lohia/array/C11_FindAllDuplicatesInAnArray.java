package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode 442 - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * Example 2:
 *
 * Input: nums = [1,1,2]
 * Output: [1]
 * Example 3:
 *
 * Input: nums = [1]
 * Output: []
 *
 * https://www.youtube.com/watch?v=lFhiz9ntwqk&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=12&t=5s
 */
public class C11_FindAllDuplicatesInAnArray {

  public List<Integer> findDuplicatesConstantSpace(int[] nums) {

    List<Integer> resultSet = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // Get the index, the element corresponds to
      int index = Math.abs(nums[i]) - 1;

      // If the number is already negative, it means we are 
      // encountering it twice
      if (nums[index] < 0)
        resultSet.add(index + 1);

      // Flip the number at the index to negative
      nums[index] = nums[index] * -1;
    }

    return resultSet;
  }

  public List<Integer> findDuplicatesLinearSpace(int[] nums) {

    List<Integer> resultSet = new ArrayList<>();

    // Set to store unique numbers
    Set<Integer> uniqueSet = new HashSet<>();
    for (int num : nums) {

      // If already present, then it is a duplicate
      if (uniqueSet.contains(num))
        resultSet.add(num);

      // Add the number to the set
      uniqueSet.add(num);
    }

    return resultSet;
  }

}