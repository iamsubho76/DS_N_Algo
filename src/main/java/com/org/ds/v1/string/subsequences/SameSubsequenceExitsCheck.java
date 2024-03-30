package com.org.ds.v1.string.subsequences;

//Given a string, the task is to check if there exist two equal sub-sequences in the given string. Two sub-sequences are said to be equal if they have the same characters arranged in the same lexicographical order but the position of characters differs from that in the original string.
//Examples:
//
//
//Input: str = “geeksforgeeks”
//Output: YES
//Two possible sub-sequences are “geeks” and “geeks”.
//Input: str = “bhuvan”
//Output: NO
//
//
//
//Approach: The approach to solving this problem is to check if any character appears more than once. Since the minimal length of matching subsequence can be 1, hence if a character occurrence in a string more than once then two similar subsequences is possible. Initialize a freq[] array of length 26. Iterate over the string and increment the frequency of the characters. Iterate over the freq array and check if freq[i] for any i in the range of 0-26 is more than 1, then it is possible.
//Below is the implementation of the above approach.

import java.util.Arrays;

class SameSubsequenceExitsCheck {
    // Function to check if
// similar subsequences
// occur in a string or not
    static boolean check(String s,
                         int l) {
        int freq[] = new int[26];
        Arrays.fill(freq, 0);

        // iterate and count
        // the frequency
        for (int i = 0; i < l; i++) {
            // counting frequency
            // of the letters
            freq[s.charAt(i) - 'a']++;
        }

        // check if frequency is more
        // than once of any character
        for (int i = 0; i < 26; i++) {
            if (freq[i] >= 2)
                return true;
        }
        return false;
    }

    // Driver Code
    public static void main(String args[]) {
        String s = "geeksforgeeks";
        int l = s.length();
        if (check(s, l))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
