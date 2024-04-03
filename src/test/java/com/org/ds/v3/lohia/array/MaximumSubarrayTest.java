package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

  private C2_MaxSumOfElementsOfSubarray maximumSubarray = new C2_MaxSumOfElementsOfSubarray();

  @Test
  void testMaxSubArray1() {
    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
    assertEquals(7, Arrays.stream(maximumSubarray.maxSubArray(arr)).sum());
  }

  @Test
  void testMaxSubArray2() {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertEquals(6, Arrays.stream(maximumSubarray.maxSubArray(arr)).sum());
  }

  @Test
  // All negative numbers
  void testMaxSubArray3() {
    int[] arr = {-2, -51, -3, -4, -1, -22, -11, -5, -7};
    assertEquals(-1, Arrays.stream(maximumSubarray.maxSubArray(arr)).sum());
  }
}