package com.org.ds.v1.array;

import java.util.HashMap;
import java.util.Map;

public class D17_SlidingWindowSmallestWindowSubstring {

    public static String findSmallestWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        int requiredChars = targetFreq.size();
        int left = 0;
        int right = 0;
        int formed = 0;
        int[] window = {-1, 0, 0}; // {window length, left index, right index}

        Map<Character, Integer> windowFreq = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreq.put(currentChar, windowFreq.getOrDefault(currentChar, 0) + 1);

            if (targetFreq.containsKey(currentChar) && targetFreq.get(currentChar).intValue() == windowFreq.get(currentChar).intValue()) {
                formed++;
            }

            while (left <= right && formed == requiredChars) {
                if (window[0] == -1 || right - left + 1 < window[0]) {
                    window[0] = right - left + 1;
                    window[1] = left;
                    window[2] = right;
                }

                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar) < targetFreq.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return window[0] == -1 ? "" : s.substring(window[1], window[2] + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String smallestWindow = findSmallestWindow(s, t);
        System.out.println("Smallest window in string \"" + s + "\" containing all characters of \"" + t + "\": " + smallestWindow);
    }
}
