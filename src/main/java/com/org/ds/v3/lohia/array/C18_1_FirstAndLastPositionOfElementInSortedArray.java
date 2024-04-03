package com.org.ds.v3.lohia.array;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 * https://www.youtube.com/watch?v=bvaYNDKp830&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=18
 */
public class C18_1_FirstAndLastPositionOfElementInSortedArray {

  public int[] searchRange(int[] nums, int target) {

    int left = findLeftBound(nums, target);
    int right = findRightBound(nums, target);

    return new int[]{left, right};
  }

  private int findLeftBound(int[] nums, int target) {
    int index = -1, low = 0, high = nums.length - 1;

    // Standard binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        index = mid;
        high = mid - 1; // Look in the left sub-array
      }
      else if (nums[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }

    return index;
  }

  private int findRightBound(int[] nums, int target) {
    int index = -1, low = 0, high = nums.length - 1;

    // Standard binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        index = mid;
        low = mid + 1; // Look in the right sub-array
      }
      else if (nums[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }

    return index;
  }

}