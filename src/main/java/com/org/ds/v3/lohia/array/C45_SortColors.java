package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/sort-colors/description/
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 *
 * https://www.youtube.com/watch?v=6sMssUHgaBs&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=46
 */
class C45_SortColors {

  void sortColors(int[] nums) {

    int start = 0;
    int mid = 0;
    int end = nums.length - 1;

    while (mid <= end) {

      switch (nums[mid]) {
        case 0:
          // Swap with start index
          swap(nums, start, mid);
          mid++;
          start++;
          break;

        case 1:
          mid++;
          break;

        case 2:
          // Swap with end index
          swap(nums, mid, end);
          end--;
          break;
      }
    }

  }

  private void swap(int[] arr, int pos1, int pos2) {
    int temp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = temp;
  }

}