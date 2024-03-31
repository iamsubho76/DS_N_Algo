package com.org.ds.v3.lohia.array;

import java.util.List;

/**
 * Question: You will be given two arrays of integers and asked to determine all integers between two sets that satisfy the following two conditions:
 * – The elements of the first array are all factors of the integer being considered
 * – The integer being considered is a factor of all elements of the second array
 *
 * Input:
 * a = { 2, 6 }
 * b = { 24, 36 }
 *
 * Output:
 * 2
 *
 * https://www.youtube.com/watch?v=-c_V4fQ2mKU&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=8
 */

public class C7_BetweenTwoSets {

  /*
   * Complete the 'getTotalX' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  int getGCD(int n1, int n2) {
    if (n2 == 0) {
      return n1;
    }
    return getGCD(n2, n1 % n2);
  }

  int getLCM(int n1, int n2) {
    if (n1 == 0 || n2 == 0)
      return 0;
    else {
      int gcd = getGCD(n1, n2);
      return Math.abs(n1 * n2) / gcd;
    }
  }

  public int getTotalX(List<Integer> a, List<Integer> b) {
    int result = 0;

    // Get LCM of all elements of a
    int lcm = a.get(0);
    for (Integer integer : a) {
      lcm = getLCM(lcm, integer);
    }

    // Get GCD of all elements of b
    int gcd = b.get(0);
    for (Integer integer : b) {
      gcd = getGCD(gcd, integer);
    }

    // Count multiples of lcm that divide the gcd
    int multiple = 0;
    while (multiple <= gcd) {
      multiple += lcm;

      if (gcd % multiple == 0)
        result++;
    }

    return result;
  }

}