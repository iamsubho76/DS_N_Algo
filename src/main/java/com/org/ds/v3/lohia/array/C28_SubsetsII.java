package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets-ii/description/
 *
 * Given an integer array nums that may contain duplicates, return all possible
 * subsets
 *  (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * https://www.youtube.com/watch?v=qGyyzpNlMDU&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=29
 */
class C28_SubsetsII {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<>();
    Arrays.sort(nums);

    // Start backtracking from the beginning
    backtrack(resultList, new ArrayList<>(), nums, 0);
    return resultList;
  }

  private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet,
                         int[] nums, int start) {
    // If the set is already present, just continue
    if (resultSets.contains((tempSet)))
      return;

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