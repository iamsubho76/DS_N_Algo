package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

  C1_SingleNumber singleNumber = new C1_SingleNumber();

  @Test
  void singleNumber1() {
    int[] arr = {2, 2, 1};
    assertEquals(1, singleNumber.singleNumber(arr));
  }

  @Test
  void singleNumber2() {
    int[] arr = {4, 1, 2, 1, 2};
    //explanation as XOR of two similar element will yield 0,
    //so, 1 XOR 1 =0 and 4 XOR 4 =0, so together 0 XOR 0 XOR 2=2
    assertEquals(4, singleNumber.singleNumber(arr));
  }
}