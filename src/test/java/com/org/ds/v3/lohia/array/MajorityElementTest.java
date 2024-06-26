package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

  private final C42_MajorityElement majorityElement;

  MajorityElementTest() {
    majorityElement = new C42_MajorityElement();
  }

  @Test
  void testMajorityElement1() {
    int[] num = {3, 3, 2};
    assertEquals(3, majorityElement.majorityElement(num));
  }

  @Test
  void testMajorityElement2() {
    int[] num = {2, 2, 1, 3, 1, 2, 2};
    assertEquals(2, majorityElement.majorityElement(num));
  }
}