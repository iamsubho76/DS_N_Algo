package com.org.ds.v3.lohia.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-i/description/
 *
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 *
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 *
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next
 * greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this
 * query is -1.
 *
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * Explanation: The next greater element for each value of nums1 is as follows:
 * - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
 * - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * Example 2:
 *
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 * Explanation: The next greater element for each value of nums1 is as follows:
 * - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
 * - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 *
 * https://www.youtube.com/watch?v=mJWQjJpEMa4&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=30
 */
public class C30_NextGreaterElementI {

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {

    if (nums2.length == 0 || nums1.length == 0)
      return new int[0];

    Map<Integer, Integer> numberNGE = new HashMap<>();
    Stack<Integer> numStack = new Stack<>();

    numStack.push(nums2[nums2.length - 1]);
    numberNGE.put(nums2[nums2.length - 1], -1);

    for (int i = nums2.length - 2; i >= 0; i--) {

      if (nums2[i] < numStack.peek()) {
        numberNGE.put(nums2[i], numStack.peek());
        numStack.push(nums2[i]);
        continue;
      }

      while (!numStack.isEmpty() && numStack.peek() < nums2[i])
        numStack.pop();

      if (numStack.isEmpty()) {
        numStack.push(nums2[i]);
        numberNGE.put(nums2[i], -1);
      } else {
        numberNGE.put(nums2[i], numStack.peek());
        numStack.push(nums2[i]);
      }
    }

    for (int i = 0; i < nums1.length; i++)
      nums1[i] = numberNGE.get(nums1[i]);

    return nums1;
  }

}