package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeIITest {

  private final C29_ValidPalindromeII validPalindromeII;

  ValidPalindromeIITest() {
    validPalindromeII = new C29_ValidPalindromeII();
  }

  @Test
  void testValidPalindrome1() {
    String s = "abca";
    assertTrue(validPalindromeII.validPalindrome(s));
  }

  @Test
  void testValidPalindrome2() {
    String s = "abc";
    assertFalse(validPalindromeII.validPalindrome(s));
  }

  @Test
  void testValidPalindrome3() {
    String s = "racecar";
    assertTrue(validPalindromeII.validPalindrome(s));
  }
}