package com.org.ds.v3.lohia.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 *
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.
 *
 * Example
 * s = abc
 * This is a valid string because frequencies are { a : 1, b:1, c:1}
 * s = abcc
 * This is a valid string because we can remove one c and have 1 of each character in the remaining string.
 * s = abccc
 * This string is not valid as we can only remove 1 occurrence of c. That leaves character frequencies of { a : 1, b:1, c:2}.
 *
 * https://www.youtube.com/watch?v=TidC-dG9C3s&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=5
 *
 */

// This is HARD problem
public class C5_SherlockAndTheValidString {

  public String isValid(String s) {

    Map<Character, Integer> charFreqMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int freq = charFreqMap.getOrDefault(c, 0);
      charFreqMap.put(c, ++freq);
    }

    int[] arr = new int[charFreqMap.size()];
    int idx = 0;
    for (Map.Entry<Character, Integer> characterIntegerEntry : charFreqMap.entrySet()) {
      arr[idx++] = characterIntegerEntry.getValue();
    }
    Arrays.sort(arr);

    if (charFreqMap.size() == 1) return "YES";

    int first = arr[0];
    int second = arr[1];
    int secondLast = arr[arr.length - 2];
    int last = arr[arr.length - 1];

    // If first and last are same, then all frequencies are same
    if (first == last) return "YES";

    // If first is 1, and all other characters have 1 frequency
    if (first == 1 && second == last) return "YES";

    // If all are same and last character has just 1 extra count
    if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";

    // Else invalid string
    return "NO";
  }
}