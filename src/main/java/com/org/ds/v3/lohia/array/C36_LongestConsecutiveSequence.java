package com.org.ds.v3.lohia.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive
 * elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 * https://www.youtube.com/watch?v=LvbtUMdcgbw&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=37
 */
public class C36_LongestConsecutiveSequence {

  int longestConsecutive(int[] nums) {

    int longestLength = 0;
    Map<Integer, Boolean> numberTravelledMap = new HashMap<>();
    for (int num : nums) {
      numberTravelledMap.put(num, Boolean.FALSE);
    }

    for (int num : nums) {
      int currentLength = 1;

      // Check in forward direction
      int nextNum = num + 1;
      while (numberTravelledMap.containsKey(nextNum) &&
          numberTravelledMap.get(nextNum) == false) {

        currentLength++;
        numberTravelledMap.put(nextNum, Boolean.TRUE);

        // Move to the next number
        nextNum++;
      }

      // Check in reverse direction
      int prevNum = num - 1;
      while (numberTravelledMap.containsKey(prevNum) &&
          numberTravelledMap.get(prevNum) == false) {

        currentLength++;
        numberTravelledMap.put(prevNum, Boolean.TRUE);

        // Move to the previous number
        prevNum--;
      }

      longestLength = Math.max(longestLength, currentLength);
    }

    return longestLength;
  }

}