package com.org.ds.v3.lohia.string;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/sorting-the-sentence/description/
 *
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
 *
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
 *
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "is2 sentence4 This1 a3"
 * Output: "This is a sentence"
 * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 * Example 2:
 *
 * Input: s = "Myself2 Me1 I4 and3"
 * Output: "Me Myself and I"
 * Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 *
 * https://www.youtube.com/watch?v=CHwgo6aZ5Wk&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=17
 */
public class C16_DF_SortingTheSentence {

  String sortSentence(String s) {

    // Map to store words in correct order
    Map<Integer, String> indexWordMap = new HashMap<>();

    // Split each word based on space
    for (String word : s.split(" ")) {
      int lastIndex = word.length() - 1;

      // get the word and index separately
      int index = word.charAt(lastIndex) - '0';
      String actualWord = word.substring(0, lastIndex);

      indexWordMap.put(index, actualWord);
    }

    // Build the actual string
    StringBuilder actualString = new StringBuilder();
    for (Map.Entry<Integer, String> indexWord : indexWordMap.entrySet()) {
      actualString.append(indexWord.getValue());
      actualString.append(" ");
    }

    return actualString.toString().trim();
  }

}