package com.org.ds.v3.lohia.array;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/equal/problem
 * Let us try to understand this problem statement first. It is actually very verbose.
 * We will try to simplify it as much as possible. Christy wants to give chocolates to her colleagues,
 * and at the same time tries to ensure that everyone has equal chocolates at the end.
 * To achieve this she either gives 1,2, or 5 chocolates to everyone except any one individual.
 *
 * Every-time she does this, it is counted as 1 operation. We need to make sure that Christy can
 * achieve this task in the minimum number of steps possible.
 *
 * Look at one of the sample test cases
 *
 * Input:
 * arr = [1, 1, 5]
 *
 * Explanation:
 * Operation 1: Give 2 chocolates to everyone except employee 3
 * => [3, 3, 5]
 *
 * Operation 2: Give 2 chocolates to everyone except employee 3
 * => [5, 5, 5]
 *
 * Hence answer = 2
 *
 * Output:
 * 2
 */

//This is Hard Problem using DP
public class C13_DF_Equal {

  int equal(int[] arr) {

    // Store all the possibilities
    int[] possibilities = new int[5];

    // Start with the minimum element
    int minimum = Arrays.stream(arr).min().getAsInt();

    for (int i = 0; i < possibilities.length; i++) {

      for (int k : arr) {
        int diff = k - minimum;
        int stepsRequired = diff / 5 + (diff % 5) / 2 + ((diff % 5) % 2) / 1;
        possibilities[i] += stepsRequired;
      }
      minimum--;
    }

    // Return the minimum number out of all the possibilities
    return Arrays.stream(possibilities).min().getAsInt();
  }

}