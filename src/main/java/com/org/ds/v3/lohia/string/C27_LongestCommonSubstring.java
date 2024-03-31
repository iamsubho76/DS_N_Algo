package com.org.ds.v3.lohia.string;

/**
 * Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.
 *
 * Examples :
 *
 * Input : X = “GeeksforGeeks”, y = “GeeksQuiz”
 * Output : 5
 * Explanation:
 * The longest common substring is “Geeks” and is of length 5.
 *
 * Input : X = “abcdxyz”, y = “xyzabcd”
 * Output : 4
 * Explanation:
 * The longest common substring is “abcd” and is of length 4.
 *
 *
 * https://www.youtube.com/watch?v=hj-HDHwifWs&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=27
 */
//Using DP
public class C27_LongestCommonSubstring {

  int longestCommonSubstring(String m, String n) {
    char[] str1 = m.toCharArray();
    char[] str2 = n.toCharArray();

    int[][] dp = new int[str1.length + 1][str2.length + 1];

    int max = 0;

    // Iterate over each position in the matrix
    for (int i = 1; i <= str1.length; i++)
      for (int j = 1; j <= str2.length; j++)

        // If characters are equal
        if (str1[i - 1] == str2[j - 1]) {
          // Get the number from diagonally opposite
          // and add 1
          dp[i][j] = dp[i - 1][j - 1] + 1;

          max = Math.max(dp[i][j], max);
        }

    return max;
  }

}