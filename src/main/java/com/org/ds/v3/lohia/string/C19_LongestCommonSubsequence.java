package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/longest-common-subsequence/description/
 *
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 *
 *
 *
 * Example 1:
 *
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * Example 2:
 *
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * Example 3:
 *
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 *
 * https://www.youtube.com/watch?v=e9tUPwZZSBI&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=19
 */
public class C19_LongestCommonSubsequence {

  int longestCommonSubsequence(String text1, String text2) {
    // Construct dp matrix
    int[][] dp = new int[text1.length() + 1][text2.length() + 1];

    // Iterate over each cell and update values
    for (int i = 1; i <= text1.length(); i++)

      for (int j = 1; j <= text2.length(); j++)

        if (text1.charAt(i - 1) == text2.charAt(j - 1))
          dp[i][j] = 1 + dp[i - 1][j - 1];
        else
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

    // Return the value in last cell
    return dp[text1.length()][text2.length()];
  }

}