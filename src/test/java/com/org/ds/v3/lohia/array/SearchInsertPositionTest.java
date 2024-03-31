package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

  private final C22_SearchInsertPosition searchInsertPosition;

  SearchInsertPositionTest() {
    searchInsertPosition = new C22_SearchInsertPosition();
  }

  @Test
  void testSearchInsert1() {
    int[] nums = {1,3,5,6};
    int target = 5;

    assertEquals(2, searchInsertPosition.searchInsert(nums, target));
  }

  @Test
  void testSearchInsert2() {
    int[] nums = {1,3,5,6};
    int target = 2;

    assertEquals(1, searchInsertPosition.searchInsert(nums, target));
  }

  @Test
  void testSearchInsert3() {
    int[] nums = {1,3,5,6};
    int target = 7;

    assertEquals(4, searchInsertPosition.searchInsert(nums, target));
  }
}