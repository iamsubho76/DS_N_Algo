package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairsTest {

  C6_FindPairOfElementsWhoseDifferenceIsTargetVal pairs = new C6_FindPairOfElementsWhoseDifferenceIsTargetVal();

  @Test
  void testPairs1() {
    int k = 2;
    int[] arr = {1, 5, 3, 4, 2};

    assertEquals(3, pairs.pairs(k, arr));
  }


  @Test
  void testPairs2() {
    int k = 1;
    int[] arr = {363374326, 364147530, 61825163, 1073065718, 1281246024,
        1399469912, 428047635, 491595254, 879792181, 1069262793};

    assertEquals(0, pairs.pairs(k, arr));
  }

  @Test
  void testPairs3() {
    int k = 2;
    int[] arr = {1, 3, 5, 8, 6, 4, 2};

    assertEquals(5, pairs.pairs(k, arr));
  }
}