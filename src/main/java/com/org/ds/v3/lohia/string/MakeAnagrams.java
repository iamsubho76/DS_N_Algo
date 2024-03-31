package com.org.ds.v3.lohia.string;

/**
 * Question: Given a two strings, find the minimum number of characters that must be deleted to make them anagrams.
 *
 * Input: str1 = “a b c”, str2 = “a m n o p”
 * Output: 6
 *
 * https://www.youtube.com/watch?v=33l2qAIgzz4&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=8
 */

public class MakeAnagrams {

  int makingAnagrams(String s1, String s2) {

    int[] c = new int[26];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    for (int i = 0; i < s1.length(); i++) {
      c[s1.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s2.length(); i++) {
      c[s2.charAt(i) - 'a']--;
    }

    int total = 0;
    for (int i : c) {
      total += Math.abs(i);
    }

    return total;
  }

}