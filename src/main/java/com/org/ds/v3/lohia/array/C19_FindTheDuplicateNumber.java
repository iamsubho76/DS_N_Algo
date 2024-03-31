package com.org.ds.v3.lohia.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * In the given problem statement, we have an array of integers and we need to find the maximum product possible for a contiguous subarray.
 *
 * The most important part of this problem is that the elements have to be contiguous. So special attention needs to be given for negative numbers and zeroes.
 *
 * Input: nums = [ 2 , 3 , -2 , 4 ]
 * Output: 6
 * Explanation: [ 2 , 3 ] has the largest product 6.
 *
 * https://www.youtube.com/watch?v=_n5MR8IxR6c&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=19
 */
public class C19_FindTheDuplicateNumber {

  public int findDuplicate(int[] nums) {

    // Start a fast and slow pointer
    // until they meet
    int slow = 0, fast = 0;
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    // As soon as they meet, move both
    // pointers at same speed until they
    // meet again
    slow = 0;
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }

  public int findDuplicatesSorting(int[] nums) {
    Arrays.sort(nums);

    int prev = -1;
    for (int num : nums) {
      if (num == prev)
        break;
      prev = num;
    }

    return prev;
  }

  public int findDuplicatesHashSet(int[] nums) {
    Set<Integer> numSet = new HashSet<>();

    for (int num : nums) {
      if (numSet.contains(num))
        return num;
      numSet.add(num);
    }

    return -1;
  }
}