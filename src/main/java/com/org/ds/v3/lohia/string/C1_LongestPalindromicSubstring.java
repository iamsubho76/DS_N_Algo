package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * https://www.youtube.com/watch?v=uX0-xyPkR2w&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=2
 */
public class C1_LongestPalindromicSubstring {

  String longestPalindrome(String str) {

    if (str.length() <= 1)
      return str;

    String LPS = "";

    for (int i = 1; i < str.length(); i++) {

      // Consider odd length
      int low = i;
      int high = i;
      while(str.charAt(low) == str.charAt(high)) {
        low--;
        high++;

        if (low == -1 || high == str.length())
          break;
      }

      String palindrome = str.substring(low+1, high);
      if (palindrome.length() > LPS.length()) {
        LPS = palindrome;
      }

      // Consider even length
      low = i-1;
      high = i;
      while(str.charAt(low) == str.charAt(high)) {
        low--;
        high++;

        if (low == -1 || high == str.length())
          break;
      }

      palindrome = str.substring(low+1, high);
      if (palindrome.length() > LPS.length()) {
        LPS = palindrome;
      }
    }

    return LPS;
  }

}