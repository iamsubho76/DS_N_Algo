package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeStringTest {

  private final C25_RearrangeSuchTwoAdjacentCharacterNotSame reorganizeString;

  ReorganizeStringTest() {
    reorganizeString = new C25_RearrangeSuchTwoAdjacentCharacterNotSame();
  }

  @Test
  void testReorganizeString1() {
    String str = "aab";

    String result = reorganizeString.reorganizeString(str);
    char prev = '.';
    for (char c : result.toCharArray()) {
      if (c == prev)
        fail("");
      prev = c;
    }

    assertTrue(true);
  }

  @Test
  void testReorganizeString2() {
    String str = "aaab";

    String result = reorganizeString.reorganizeString(str);
    assertEquals("", result);
  }

  @Test
  void testReorganizeString3() {
    String str = "xxxxwer";

    String result = reorganizeString.reorganizeString(str);
    char prev = '.';
    for (char c : result.toCharArray()) {
      if (c == prev)
        fail("");
      prev = c;
    }

    assertTrue(true);
  }
}