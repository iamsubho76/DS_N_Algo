package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * Example 3:
 *
 * Input: nums = [1], target = 0
 * Output: -1
 *
 * https://www.youtube.com/watch?v=iXLMMbdjeNM&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=11
 */

//This is HARD Problem
class C10_DF_SearchInRotatedSortedArray {

  private int findRotationIndex(int[] nums) {

    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {

      int mid = (left + right) / 2;
      if (mid == right) {
        return mid;
      }
      if (nums[mid + 1] < nums[mid])
        return mid;

      if (nums[left] <= nums[mid]) {
        left = mid + 1;
      } else
        right = mid - 1;
    }

    return -1;
  }

  private int binarySearch(int[] arr, int left, int right, int target) {

    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target)
        return mid;

      if (arr[mid] < target) {
        left = mid + 1;
      } else
        right = mid - 1;
    }

    return -1;
  }

  private int modifiedBinarySearch(int[] arr, int target, int left, int right) {

    // Not found
    if (left > right)
      return -1;

    // Avoid overflow, same as (left + right)/2
    int mid = left + ((right - left) / 2);
    if (arr[mid] == target)
      return mid; // Found

    // If left half is sorted
    if (arr[mid] >= arr[left]) {

      // If key is in left half
      if (arr[left] <= target && target <= arr[mid])
        return modifiedBinarySearch(arr, target, left, mid - 1);
      else
        return modifiedBinarySearch(arr, target, mid + 1, right);

    } else {
      // If right half is sorted

      // If key is in right half
      if (arr[mid] <= target && target <= arr[right])
        return modifiedBinarySearch(arr, target, mid + 1, right);
      else
        return modifiedBinarySearch(arr, target, left, mid - 1);
    }
  }

  /**
   * Search by first finding the rotation index. The index about which the array has been rotated.
   * Then compare the target value to do a simple binary search in the left sub-array or right sub-array.
   */
  public int search(int[] nums, int target) {

    int rotationIndex = findRotationIndex(nums);

    if (rotationIndex == -1 || rotationIndex == nums.length - 1)
      return binarySearch(nums, 0, nums.length - 1, target);

    if (nums[0] <= target) {
      return binarySearch(nums, 0, rotationIndex, target);
    } else
      return binarySearch(nums, rotationIndex + 1, nums.length - 1, target);
  }

  /**
   * Modified version of binary search. One sub-array will always be sorted. Based on that we can always discard one
   * half of the array
   */
  public int alternateSearch(int[] nums, int target) {
    return modifiedBinarySearch(nums, target, 0, nums.length - 1);
  }
}