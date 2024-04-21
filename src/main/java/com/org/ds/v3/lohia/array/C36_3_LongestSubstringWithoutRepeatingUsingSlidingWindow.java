package com.org.ds.v3.lohia.array;

import java.util.*;

public class C36_3_LongestSubstringWithoutRepeatingUsingSlidingWindow {

    public static String longestSubstringWithoutRepeating(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        int maxLength = 0;
        int start = 0;
        int longestStart = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                // Update the start index to the next index of the repeating character
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, end);
            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestStart = start;
            }
        }
        
        return s.substring(longestStart, longestStart + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String longestSubstring = longestSubstringWithoutRepeating(s);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
}
