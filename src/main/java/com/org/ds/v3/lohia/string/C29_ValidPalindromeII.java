package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 *
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aba"
 * Output: true
 * Example 2:
 *
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * Example 3:
 *
 * Input: s = "abc"
 * Output: false
 *
 * https://www.youtube.com/watch?v=wX3-411uJH0&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=29
 */
public class C29_ValidPalindromeII {

  boolean validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      // Keep moving till characters match
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      } else {
        // Try deleting 1 character from either direction
        return isPalindrome(s, left + 1, right)
            || isPalindrome(s, left, right - 1);
      }
    }

    return true;
  }

  private boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      } else return false;
    }
    return true;
  }

}