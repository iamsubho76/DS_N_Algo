package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/majority-element/description/
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * https://www.youtube.com/watch?v=wD7fs5P_MVo&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=43
 */
class C42_MajorityElement {

  int majorityElement(int[] num) {

    int majority = num[0], votes = 1;

    for (int i = 1; i < num.length; i++) {

      if (votes == 0) {
        votes++;
        majority = num[i];
      } else if (majority == num[i]) {
        votes++;
      } else
        votes--;

    }
    return majority;
  }

}