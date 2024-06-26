package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeAnagramsTest {

  private C8_MakeAnagrams makeAnagrams;

  public MakeAnagramsTest() {
    makeAnagrams = new C8_MakeAnagrams();
  }

  @Test
  void testMakeAnagrams1() {
    String s1 = "Test1ng-Leet=code-Q!";
    String s2 = "rat";

    assertEquals(1, makeAnagrams.makingAnagrams(s1, s2));
  }

  @Test
  void testMakeAnagrams2() {
    String s1 = "abc";
    String s2 = "cde";

    assertEquals(4, makeAnagrams.makingAnagrams(s1, s2));
  }

  @Test
  void testMakeAnagrams3() {
    String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
    String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";

    assertEquals(19, makeAnagrams.makingAnagrams(s1, s2));
  }

}