package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSmallerThanTheCurrentNumberTest {

  private final C21_NumbersSmallerThanTheCurrentNumber numbersSmallerThanTheCurrentNumber;

  NumbersSmallerThanTheCurrentNumberTest() {
    numbersSmallerThanTheCurrentNumber = new C21_NumbersSmallerThanTheCurrentNumber();
  }

  @Test
  void testSmallerNumbersThanCurrent1() {
    int[] nums = {8, 1, 2, 2, 3};
    int[] expected = {4, 0, 1, 1, 3};

    assertArrayEquals(expected, numbersSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums));
  }

  @Test
  void testSmallerNumbersThanCurrent2() {
    int[] nums = {7, 7, 7, 7};
    int[] expected = {0, 0, 0, 0};

    assertArrayEquals(expected, numbersSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums));
  }

  @Test
  void testSmallerNumbersThanCurrent3() {
    int[] nums = {1};
    int[] expected = {0};

    assertArrayEquals(expected, numbersSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums));
  }

  @Test
  void testSmallerNumbersThanCurrent4() {
    int[] nums = {1, 2};
    int[] expected = {0, 1};

    assertArrayEquals(expected, numbersSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums));
  }
}