package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C59LongestIncreasingSubsequenceTest {

  private final C59_LongestIncreasingSubsequence c59LongestIncreasingSubsequence;

  C59LongestIncreasingSubsequenceTest() {
    c59LongestIncreasingSubsequence = new C59_LongestIncreasingSubsequence();
  }

  @Test
  void testLengthOfLIS1() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

    assertEquals(4, c59LongestIncreasingSubsequence.lengthOfLIS(nums));
  }

  @Test
  void testLengthOfLIS2() {
    int[] nums = {0, 1, 0, 3, 2, 3};

    assertEquals(4, c59LongestIncreasingSubsequence.lengthOfLIS(nums));
  }

  @Test
  void testLengthOfLIS3() {
    int[] nums = {7, 7, 7, 7, 7, 7, 7};

    assertEquals(1, c59LongestIncreasingSubsequence.lengthOfLIS(nums));
  }

  @Test
  void testLengthOfLIS4() {
    int[] nums = {3, 4, -1, 0, 6, 2, 3};

    assertEquals(4, c59LongestIncreasingSubsequence.lengthOfLIS(nums));
  }
}