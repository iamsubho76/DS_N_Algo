package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastPositionOfElementInSortedArrayTest {

  private final C18_1_FirstAndLastPositionOfElementInSortedArray firstAndLastPositionOfElementInSortedArray;

  FirstAndLastPositionOfElementInSortedArrayTest() {
    firstAndLastPositionOfElementInSortedArray = new C18_1_FirstAndLastPositionOfElementInSortedArray();
  }

  @Test
  void testSearchRange1() {
    int[] nums = {8,5, 2,1,7, 7, 8, 8, 10};
    int target = 8;

    int[] expected = {3, 4};
    int[] actual = firstAndLastPositionOfElementInSortedArray.searchRange(nums, target);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testSearchRange2() {
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 6;

    int[] expected = {-1, -1};
    int[] actual = firstAndLastPositionOfElementInSortedArray.searchRange(nums, target);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testSearchRange3() {
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 5;

    int[] expected = {0, 0};
    int[] actual = firstAndLastPositionOfElementInSortedArray.searchRange(nums, target);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testSearchRange4() {
    int[] nums = {};
    int target = 5;

    int[] expected = {-1, -1};
    int[] actual = firstAndLastPositionOfElementInSortedArray.searchRange(nums, target);

    assertArrayEquals(expected, actual);
  }
}