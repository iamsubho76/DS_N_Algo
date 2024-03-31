package com.org.ds.v3.lohia.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * https://www.youtube.com/watch?v=0LIctkgJ2hQ&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=34
 */
class C33_ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {

    // Create hashset to store integers
    Set<Integer> intSet = new HashSet<>();

    // Iterate over each element
    for (int num : nums) {

      // Check the number in hashset
      if (intSet.contains(num))
        return true;

      // Add the number to hashset
      intSet.add(num);
    }

    return false;
  }

}