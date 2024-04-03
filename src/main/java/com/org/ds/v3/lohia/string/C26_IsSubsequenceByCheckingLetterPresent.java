package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/is-subsequence/description/
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative positions
 * of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 *
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 *
 * https://www.youtube.com/watch?v=Gkz3SwtdSes&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=26
 */
public class C26_IsSubsequenceByCheckingLetterPresent {

  boolean isSubsequence(String str1, String str2) {

    // Initialize pointers for both strings
    int i = 0;
    int j = 0;
    // We can iterate until either of them becomes zero...

    while (i < str1.length() && j < str2.length()) {
      // Compare characters, increment both pointers if same
      if (str1.charAt(i) == str2.charAt(j)) {
        i++;
        j++;
      } else {
        j++; // Only increment second pointer
      }
    }

    // If it is a subsequence, 'i' will have travelled full
    // length of string 'str1', so just check and return
    return (i == str1.length());
  }

}