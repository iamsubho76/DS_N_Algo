package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

  private C10_DF_SearchInRotatedSortedArray searchInRotatedSortedArray;

  SearchInRotatedSortedArrayTest() {
    searchInRotatedSortedArray = new C10_DF_SearchInRotatedSortedArray();
  }

  @Test
  void testSearchFound() {
    int[] nums = {8, 4, 5, 6, 7};
    assertEquals(1, searchInRotatedSortedArray.search(nums, 4));
    assertEquals(1, searchInRotatedSortedArray.alternateSearch(nums, 4));

    nums = new int[]{4, 5, 6, 7};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 4));
    assertEquals(0, searchInRotatedSortedArray.alternateSearch(nums, 4));

    nums = new int[]{4, 5, 6, 7, 1};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 4));
    assertEquals(0, searchInRotatedSortedArray.alternateSearch(nums, 4));

    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    assertEquals(4, searchInRotatedSortedArray.search(nums, 0));
    assertEquals(4, searchInRotatedSortedArray.alternateSearch(nums, 0));

    nums = new int[]{4};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 4));
    assertEquals(0, searchInRotatedSortedArray.alternateSearch(nums, 4));

    nums = new int[]{5, 1, 3};
    assertEquals(0, searchInRotatedSortedArray.search(nums, 5));
    assertEquals(0, searchInRotatedSortedArray.alternateSearch(nums, 5));

    nums = new int[]{8, 9, 2, 3, 4};
    assertEquals(1, searchInRotatedSortedArray.search(nums, 9));
    assertEquals(1, searchInRotatedSortedArray.alternateSearch(nums, 9));
  }

  @Test
  void testSearchNotFound() {
    int[] nums = new int[]{};
    assertEquals(-1, searchInRotatedSortedArray.alternateSearch(nums, 4));

    nums = new int[]{4, 5, 6, 7, 0, 1, 2};
    assertEquals(-1, searchInRotatedSortedArray.alternateSearch(nums, 3));

    nums = new int[]{4};
    assertEquals(-1, searchInRotatedSortedArray.alternateSearch(nums, 0));
  }

}