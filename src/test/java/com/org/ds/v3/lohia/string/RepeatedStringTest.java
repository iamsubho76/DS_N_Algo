package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedStringTest {

  private final C9_RepeatedString repeatedString;

  public RepeatedStringTest() {
    repeatedString = new C9_RepeatedString();
  }

  @Test
  void testRepeatedString1() {
    String s = "aba";
    long n = 10;

    assertEquals(7, repeatedString.repeatedString(s, n));
  }

  @Test
  void testRepeatedString2() {
    String s = "a";
    long n = 1000000000000L;

    assertEquals(1000000000000L, repeatedString.repeatedString(s, n));
  }

  @Test
  void testRepeatedString3() {
    String s = "aab";
    long n = 882787;

    assertEquals(588525, repeatedString.repeatedString(s, n));
  }
}