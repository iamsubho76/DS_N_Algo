package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {

  private final C22_ShuffleString shuffleString;

  ShuffleStringTest() {
    shuffleString = new C22_ShuffleString();
  }

  @Test
  void testRestoreString1() {
    String s = "codeleet";
    int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

    assertEquals("leetcode", shuffleString.restoreString(s, indices));
  }

  @Test
  void testRestoreString2() {
    String s = "abc";
    int[] indices = {0, 1, 2};

    assertEquals("abc", shuffleString.restoreString(s, indices));
  }
}