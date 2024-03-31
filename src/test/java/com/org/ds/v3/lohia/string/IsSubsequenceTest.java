package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

  private final C26_IsSubsequence isSubsequence;

  IsSubsequenceTest() {
    isSubsequence = new C26_IsSubsequence();
  }

  @Test
  void testIsSubsequence1() {
    String s = "abc";
    String t = "ahbgdc";

    assertTrue(isSubsequence.isSubsequence(s, t));
  }

  @Test
  void testIsSubsequence2() {
    String s = "abx";
    String t = "ahbgdc";

    assertFalse(isSubsequence.isSubsequence(s, t));
  }

  @Test
  void testIsSubsequence3() {
    String s = "";
    String t = "ahbgdc";

    assertTrue(isSubsequence.isSubsequence(s, t));
  }

  @Test
  void testIsSubsequence4() {
    String s = "ahbgdc";
    String t = "";

    assertFalse(isSubsequence.isSubsequence(s, t));
  }
}