package com.org.ds.v1.string.searching;

/**
 * Given two strings S1 and S2, The task is to find if S1 is a substring of S2. If yes, return the index of the first occurrence, else return -1.
 * <p>
 * Examples :
 * <p>
 * Input: S1 = “for”, S2= “geeksforgeeks”
 * Output: 5
 * Explanation: String “for” is present as a substring of s2.
 * <p>
 * Input: S1 = “practice”, S2= “geeksforgeeks”
 * Output: -1.
 * Explanation: There is no occurrence of “practice” in “geeksforgeeks”
 * <p>
 * Naive Approach: Below is the idea to solve the problem.
 * <p>
 * Run a loop from start to end and for every index in the given string check whether the sub-string can be formed from that index. This can be done by running a nested loop traversing the given string and in that loop running another loop checking for sub-strings starting from every index.
 * <p>
 * Follow the steps below to implement the idea:
 * <p>
 * Run a for loop with counter i from 0 to N – M.
 * Run a for loop with counter j from 0 to M-1.
 * Compare jth character of S1 with (i+j)th character of S2.
 * If the loop terminates after matching all the characters, then return i, i.e. substring S1 is found starting from ith character of S2
 * Return -1 as no substring is found.
 * Below is the Implementation of the above idea.
 */
public class CheckIfStrIsSubstrOfAnother {

    // Returns true if s1 is substring of s2
    static int isSubstring(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;

			/* For current index i, check for
			pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;

            if (j == M)
                return i;
        }

        return -1;
    }

    /* Driver code */
    public static void main(String args[]) {
        String s1 = "for";
        String s2 = "geeksforgeeks";

        int res = isSubstring(s1, s2);

        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);
    }
}