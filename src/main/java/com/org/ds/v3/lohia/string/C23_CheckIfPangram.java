package com.org.ds.v3.lohia.string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 *
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * Example 2:
 *
 * Input: sentence = "leetcode"
 * Output: false
 *
 * https://www.youtube.com/watch?v=reddjqY1gpE&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=23
 */
//It means the sentence should contain all 26 english alphabet
public class C23_CheckIfPangram {

  boolean checkIfPangram(String sentence) {

    Set<Character> alphabetSet = new HashSet<>();

    // Add all characters from 'a' to 'z' in hashset
    for (int i = 'a'; i <= 'z'; i++) {
      alphabetSet.add((char) i);
    }

    // Remove every character and check
    // if set becomes empty at any point of time
    for (int i = 0; i < sentence.length(); i++) {
      alphabetSet.remove(sentence.charAt(i));
      if (alphabetSet.isEmpty())
        return true;
    }

    return false;
  }

}