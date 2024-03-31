package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/description/
 *
 * Given an integer array nums of unique elements, return all possible
 * subsets
 *  (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * https://www.youtube.com/watch?v=3tpjp5h3M6Y&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=27
 */
class C26_Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<>();

    // Start backtracking from the beginning
    backtrack(resultList, new ArrayList<>(), nums, 0);
    return resultList;
  }

  private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet,
                         int[] nums, int start) {
    // Add the set to result set
    resultSets.add(new ArrayList<>(tempSet));
    for (int i = start; i < nums.length; i++) {

      // Case of including the number
      tempSet.add(nums[i]);

      // Backtrack the new subset
      backtrack(resultSets, tempSet, nums, i + 1);

      // Case of not-including the number
      tempSet.remove(tempSet.size() - 1);
    }
  }

}