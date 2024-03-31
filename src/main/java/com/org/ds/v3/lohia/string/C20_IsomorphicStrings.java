package com.org.ds.v3.lohia.string;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 * https://www.youtube.com/watch?v=ogTMIFPjNkQ&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=20
 */
public class C20_IsomorphicStrings {

  boolean isIsomorphic(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    // Create a hashmap to store character mappings
    Map<Character, Character> charMappingMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {

      char original = s.charAt(i);
      char replacement = t.charAt(i);

      if (!charMappingMap.containsKey(original)) {
        if (!charMappingMap.containsValue(replacement))
          charMappingMap.put(original, replacement);
        else
          return false;
      }
      else {
        char mappedCharacter = charMappingMap.get(original);
        if (mappedCharacter != replacement)
          return false;
      }
    }

    return true;
  }

}