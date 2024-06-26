package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

  private final C33_ContainsDuplicate containsDuplicate;

  ContainsDuplicateTest() {
    containsDuplicate = new C33_ContainsDuplicate();
  }

  @Test
  void testContainsDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    assertTrue(containsDuplicate.containsDuplicate(nums));
  }

  @Test
  void testContainsDuplicate2() {
    int[] nums = {1, 2, 3, 4};
    assertFalse(containsDuplicate.containsDuplicate(nums));
  }

  @Test
  void testContainsDuplicate3() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    assertTrue(containsDuplicate.containsDuplicate(nums));
  }
}