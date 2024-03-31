package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 *
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 *
 * https://www.youtube.com/watch?v=0vlc5ttPftY&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=18
 */
public class C18_LengthOfLastWord {

  int lengthOfLastWord(String s) {

    int count = 0;

    for (int i = s.length() - 1; i >= 0; i--) {

      // a letter is found so count
      if (s.charAt(i) != ' ') {
        count++;
      }
      else {
        // it's a white space instead
        // Did we already started to count a word ?
        // Yes so we found the last word
        if (count > 0)
          return count;
      }
    }

    return count;
  }

}