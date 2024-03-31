package com.org.ds.v3.lohia.string;

/**
 * Question: Given a string, count the number of times the letter ‘a’ is repeated.
 *
 * Input: str = “abcac”, n= 10
 *
 * Output: 4
 *
 * https://www.youtube.com/watch?v=VIbajJlTpdA&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=9
 *
 */
public class C9_RepeatedString {

  long repeatedString(String s, long n) {

    long strLength = s.length();

    // Count the number of 'a' in the given string
    int count = 0;
    for (int i = 0; i < strLength; i++) {
      if (s.charAt(i) == 'a') {
        ++count;
      }
    }

    long repeatedTimes = n / strLength;

    // Find the length of string left after repetitions
    long stringLeftLength = n - (strLength * repeatedTimes);

    // Count the remaining repetitions
    int extra = 0;
    for (int i = 0; i < stringLeftLength; i++) {
      if (s.charAt(i) == 'a') {
        ++extra;
      }
    }

    long totalCount = (repeatedTimes * count) + extra;

    return totalCount;
  }

}