package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

  private final C24_DF_EditDistance editDistance;

  EditDistanceTest() {
    editDistance = new C24_DF_EditDistance();
  }

  @Test
  void testMinDistance1() {
    String word1 = "horse";
    String word2 = "ros";
    assertEquals(3, editDistance.minDistance(word1, word2));
  }

  @Test
  void testMinDistance2() {
    String word1 = "intention";
    String word2 = "execution";
    assertEquals(5, editDistance.minDistance(word1, word2));
  }

  @Test
  void testMinDistance3() {
    String word1 = "abcdef";
    String word2 = "azcde";
    assertEquals(2, editDistance.minDistance(word1, word2));
  }
}