package com.org.ds.v3.lohia.string;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * https://www.youtube.com/watch?v=aUVEMnlcw4E&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=12
 */
public class C11_LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    StringBuilder result = new StringBuilder();

    // Sort the array
    Arrays.sort(strs);

    // Get the first and last strings
    char[] first = strs[0].toCharArray();
    char[] last = strs[strs.length - 1].toCharArray();

    // Start comparing
    for (int i = 0; i < first.length; i++) {
      if (first[i] != last[i])
        break;
      result.append(first[i]);
    }

    return result.toString();
  }

}