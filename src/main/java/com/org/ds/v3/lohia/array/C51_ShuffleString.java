package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/shuffle-string/description/
 *
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 * Example 2:
 *
 * Input: s = "abc", indices = [0,1,2]
 * Output: "abc"
 * Explanation: After shuffling, each character remains in its position.
 *
 * https://www.youtube.com/watch?v=1A0rqX1Xp2E&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=52
 */
public class C51_ShuffleString {

  String restoreString(String s, int[] indices) {

    // Character array to form final string
    char[] str = new char[s.length()];

    // Do what the question says
    for (int i = 0; i < s.length(); i++) {
      str[indices[i]] = s.charAt(i);
    }

    // Return the restored string
    return String.valueOf(str);
  }

}