package com.org.ds.v3.lohia.string;

/**
 * A string is said to be valid when it has only distinct characters and none of them repeat simultaneously. For example, if string ‘s two distinct characters are x and y, then valid examples could be xyxyx or yxyxy but not xxyy or xyyx.
 *
 * Question: Given a sample string, we need to determine what is the maximum length of valid string that can be made by deleting any of the characters.
 *
 * Input: beabeefeab
 * Output: 5
 *
 * https://www.youtube.com/watch?v=wG_sFhuYcnA&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=4
 *
 */
public class C4_TwoCharacters {

  public static final int NUM_LETTERS = 26;

  public int alternate(String str) {

    /* Edge case */
    if (str.length() <= 1) {
      System.out.println(0);
      return 0;
    }

    /* Create arrays representing the 26^2 subproblems */
    int[][] pair = new int[NUM_LETTERS][NUM_LETTERS];
    int[][] count = new int[NUM_LETTERS][NUM_LETTERS];

    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      int letterNum = letter - 'a';

      /* Update row */
      for (int col = 0; col < NUM_LETTERS; col++) {
        if (pair[letterNum][col] == letter) {
          count[letterNum][col] = -1;
        }
        if (count[letterNum][col] != -1) {
          pair[letterNum][col] = letter;
          count[letterNum][col]++;
        }
      }

      /* Update column */
      for (int row = 0; row < NUM_LETTERS; row++) {
        if (pair[row][letterNum] == letter) {
          count[row][letterNum] = -1;
        }
        if (count[row][letterNum] != -1) {
          pair[row][letterNum] = letter;
          count[row][letterNum]++;
        }
      }
    }

    /* Find max in "count" array */
    int max = 0;
    for (int row = 0; row < NUM_LETTERS; row++) {
      for (int col = 0; col < NUM_LETTERS; col++) {
        max = Math.max(max, count[row][col]);
      }
    }
    return max;
  }

}