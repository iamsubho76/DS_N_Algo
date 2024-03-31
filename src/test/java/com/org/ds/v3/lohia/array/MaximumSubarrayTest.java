package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

  private C2_MaximumSubarray maximumSubarray = new C2_MaximumSubarray();

  @Test
  void testMaxSubArray1() {
    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
    assertEquals(7, maximumSubarray.maxSubArray(arr));
  }

  @Test
  void testMaxSubArray2() {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertEquals(6, maximumSubarray.maxSubArray(arr));
  }

  @Test
  // All negative numbers
  void testMaxSubArray3() {
    int[] arr = {-2, -51, -3, -4, -1, -22, -11, -5, -7};
    assertEquals(-1, maximumSubarray.maxSubArray(arr));
  }
}