package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
 *
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 *
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 *
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 *
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 *
 *
 * https://www.youtube.com/watch?v=FEXJGn19u7Y&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=55
 */
class MaximumVowelsInASubstringTest {

  private final C55_MaximumVowelsInASubstring maximumVowelsInASubstring;

  MaximumVowelsInASubstringTest() {
    maximumVowelsInASubstring = new C55_MaximumVowelsInASubstring();
  }

  @Test
  void testMaxVowels1() {
    String s = "abciiidef";
    int k = 3;

    assertEquals(3, maximumVowelsInASubstring.maxVowels(s, k));
  }

  @Test
  void testMaxVowels2() {
    String s = "aeiou";
    int k = 2;

    assertEquals(2, maximumVowelsInASubstring.maxVowels(s, k));
  }

  @Test
  void testMaxVowels3() {
    String s = "leetcode";
    int k = 3;

    assertEquals(2, maximumVowelsInASubstring.maxVowels(s, k));
  }
}