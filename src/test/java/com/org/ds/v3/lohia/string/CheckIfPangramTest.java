package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfPangramTest {

  private final C23_CheckIfPangram checkIfPangram;

  CheckIfPangramTest() {
    checkIfPangram = new C23_CheckIfPangram();
  }

  @Test
  void testCheckIfPangram1() {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    assertTrue(checkIfPangram.checkIfPangram(sentence));
  }

  @Test
  void testCheckIfPangram2() {
    String sentence = "studyalgorithms";
    assertFalse(checkIfPangram.checkIfPangram(sentence));
  }
}