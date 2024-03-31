package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/search-insert-position/description/
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * https://www.youtube.com/watch?v=p07ahfFzMi0&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=23
 */
public class C22_SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {

    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return low;
  }

}