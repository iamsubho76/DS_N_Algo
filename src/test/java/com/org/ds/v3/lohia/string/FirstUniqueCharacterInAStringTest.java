package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

  C2_FirstUniqueCharacterInAString firstUniqueCharacterInAString = new C2_FirstUniqueCharacterInAString();

  @Test
  void testFirstUniqueChar1() {
    String str = "studyalgorithms";
    assertEquals(2, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar2() {
    String str = "ilovecode";
    assertEquals(0, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar3() {
    String str = "loveleetcode";
    assertEquals(2, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar4() {
    String str = "leetcode";
    assertEquals(0, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar5() {
    String str = "lotsOfLove";
    assertEquals(2, firstUniqueCharacterInAString.firstUniqueChar(str));
  }

  @Test
  void testFirstUniqueChar6() {
    String str = "fourByFourFrog";
    assertEquals(4, firstUniqueCharacterInAString.firstUniqueChar(str));
  }
}