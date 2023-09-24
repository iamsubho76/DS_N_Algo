package com.org.ds.v1.string.searching;

/**
 * Given two strings, str1 and str2, the task is to print the indices(Consider, indices starting from 0) of the occurrence of str2 in str1. If no such index occurs, print “NONE”.
 * <p>
 * Examples:
 * <p>
 * Input : GeeksforGeeks
 * Geeks
 * Output : 0 8
 * Input : GFG
 * g
 * Output : NONE
 * <p>
 * Approach 1 (Naive Approach):
 * <p>
 * A simple solution is to check all substrings of a given string one by one. If a substring matches print its index.
 */
class PrintAllOccurrencesOfAStringAsASubstringInAnotherString {

    static void printIndex(String str, String s) {

        boolean flag = false;
        for (int i = 0; i < str.length() - s.length() + 1;
             i++) {
            if (str.substring(i, i + s.length())
                    .equals(s)) {
                System.out.print(i + " ");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("NONE");
        }
    }

    // Driver code
    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        String str2 = "Geeks";
        printIndex(str1, str2);
    }
}

// This code is contributed by Rajput-JI
