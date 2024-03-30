package com.org.ds.v1.string.hard;

import java.util.HashSet;

public class DistinctPalindromicSubstrings {
    public static HashSet<String> findDistinctPalindromicSubstrings(String str) {
        HashSet<String> palindromes = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) {
                    palindromes.add(substring);
                }
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "ababa";
        HashSet<String> distinctPalindromes = findDistinctPalindromicSubstrings(input);
        System.out.println("Distinct Palindromic Substrings: " + distinctPalindromes);
    }
}
