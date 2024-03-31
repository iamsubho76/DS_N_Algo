package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/description/
 *
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * Example 2:
 *
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * Example 3:
 *
 * Input: nums = [1]
 * Output: [[1]]
 *
 * https://www.youtube.com/watch?v=H232aocj7bQ&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=28
 */
public class C27_Permutations {

  public List<List<Integer>> permute(int[] nums) {

    List<List<Integer>> resultList = new ArrayList<>();

    backtrack(resultList, new ArrayList<>(), nums);
    return resultList;
  }

  private void backtrack(List<List<Integer>> resultList,
                         ArrayList<Integer> tempList, int[] nums) {
    // If we match the length, it is a permutation
    if (tempList.size() == nums.length) {
      resultList.add(new ArrayList<>(tempList));
      return;
    }

    for (int number : nums) {
      // Skip if we get same element
      if (tempList.contains(number))
        continue;

      // Add the new element
      tempList.add(number);

      // Go back to try other element
      backtrack(resultList, tempList, nums);

      // Remove the element
      tempList.remove(tempList.size() - 1);
    }
  }

}