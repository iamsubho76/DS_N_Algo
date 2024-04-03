package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 *
 * https://www.youtube.com/watch?v=3X-NqtP_kKQ&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=31
 */
public class C31_ReverseWordsInPlaceOfAStringIII {

  String reverseWords(String s) {

    char[] arr = s.toCharArray();

    int left = 0, right = 0;

    while (right < arr.length) {
      // If we find a space, reverse the word
      if (arr[right] == ' ') {
        reverse(arr, left, right - 1);
        left = right + 1;
      }

      right++;
    }

    // Reverse the last word
    reverse(arr, left, right - 1);

    // Return the string
    return new String(arr);
  }

  private void reverse(char[] arr, int left, int right) {
    while (left < right) {
      char temp = arr[left];
      arr[left++] = arr[right];
      arr[right--] = temp;
    }
  }

}