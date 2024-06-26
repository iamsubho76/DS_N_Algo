package com.org.ds.v3.lohia.array;

/**
 * Given the array nums, for each nums[i] find out how many numbers in
 * the array are smaller than it. That is, for each nums[i] you have
 * to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * Example 2:
 *
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 * Example 3:
 *
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 *
 * https://www.youtube.com/watch?v=C5u_hvbq1qQ&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=22
 */
public class C21_1_FindOutHowManyNumbersInTheArrayAreSmallerThanIt {

  public int[] smallerNumbersThanCurrent(int[] nums) {

    // Create buckets for counting sort
    int[] buckets = new int[102];

    // Get frequency of each element
    for (int num : nums) {
      buckets[num]++;
    }

    // Count smaller numbers than each element
    for (int i = 1; i < buckets.length; i++) {
      buckets[i] += buckets[i - 1];
    }

    // Populate the result
    int[] result = new int[nums.length];
    for (int i = 0; i < result.length; i++) {
      if (nums[i] == 0)
        result[i] = 0;
      else
        result[i] = buckets[nums[i] - 1];
    }

    return result;
  }

}