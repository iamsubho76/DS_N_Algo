package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringTest {

  private final C27_LongestCommonSubstring longestCommonSubstring;

  LongestCommonSubstringTest() {
    longestCommonSubstring = new C27_LongestCommonSubstring();
  }

  @Test
  void testLongestCommonSubstring1() {
    String m = "zfbcdzb";
    String n = "zbcdf";

    assertEquals(3, longestCommonSubstring.longestCommonSubstring(m, n));
  }

  @Test
  void testLongestCommonSubstring2() {
    String m = "abcdxyz";
    String n = "xyzabcd";

    assertEquals(4, longestCommonSubstring.longestCommonSubstring(m, n));
  }

  @Test
  void testLongestCommonSubstring3() {
    String m = "dadef";
    String n = "adwce";

    assertEquals(2, longestCommonSubstring.longestCommonSubstring(m, n));
  }
}