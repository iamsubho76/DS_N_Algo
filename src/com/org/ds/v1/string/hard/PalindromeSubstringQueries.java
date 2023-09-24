package com.org.ds.v1.string.hard;

import java.util.Arrays;
import java.util.List;

/**
 * Given a string and several queries on the substrings of the given input string to check whether the substring is a palindrome or not.
 * <p>
 * Examples :
 * <p>
 * Suppose our input string is “abaaabaaaba” and the queries- [0, 10], [5, 8], [2, 5], [5, 9]
 * We have to tell that the substring having the starting and ending indices as above is a palindrome or not.
 * [0, 10] ? Substring is “abaaabaaaba” which is a palindrome.
 * [5, 8] ? Substring is “baaa” which is not a palindrome.
 * [2, 5] ? Substring is “aaab” which is not a palindrome.
 * [5, 9] ? Substring is “baaab” which is a palindrome.
 * <p>
 * Let us assume that there are Q such queries to be answered and N is the length of our input string. There are the following two ways to answer these queries.
 * Method 1 (Naive) :
 * <p>
 * One by one we go through all the substrings of the queries and check whether the substring under consideration is a palindrome or not.
 * Since there are Q queries and each query can take O(N) worse case time to answer, this method takes O(Q.N) time in the worst case. Although this is an in-place/space-efficient algorithm, still there is a more efficient method to do this.
 */
public class PalindromeSubstringQueries {

    // A function to check if a string str is palindrome
    // in the range L to R
    public static boolean isPalindrome(String str, int L, int R) {
        // Keep comparing characters while they are same
        while (R > L) {
            if (str.charAt(L++) != str.charAt(R--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abaaabaaaba";
        int n = str.length();

        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(0, 10),
                Arrays.asList(5, 8),
                Arrays.asList(2, 5),
                Arrays.asList(5, 9)
        );

        for (List<Integer> q : queries) {
            boolean result = isPalindrome(str, q.get(0), q.get(1));
            if (result) {
                System.out.println("The substring [" + q.get(0) + "," + q.get(1)
                        + "] is a palindrome");
            } else {
                System.out.println("The substring [" + q.get(0) + "," + q.get(1)
                        + "] is not palindrome");
            }
        }
    }
}
