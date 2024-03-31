package com.org.ds.v3.lohia.string;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 *
 *  https://www.youtube.com/watch?v=tYozGI1Vd_s&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=2
 * TC: O(n) SC: O(1)
 */
public class C2_FirstUniqueCharacterInAString {
    public int firstUniqueChar(String str) {

        int index = -1;

        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Update the map
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Get the current frequency
            int freq = charFreqMap.getOrDefault(c, 0);

            // Update the map
            charFreqMap.put(c, (freq + 1));
        }

        for (int i = 0; i < str.length(); i++) {
            if (charFreqMap.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
