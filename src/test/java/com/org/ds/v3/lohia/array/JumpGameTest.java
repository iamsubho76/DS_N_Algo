package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

  private final C53_JumpGame jumpGame;

  JumpGameTest() {
    jumpGame = new C53_JumpGame();
  }

  @Test
  void testCanJump1() {
    int[] nums = {2, 3, 1, 1, 4};

    assertTrue(jumpGame.canJump(nums));
  }

  @Test
  void testCanJump2() {
    int[] nums = {3, 2, 1, 0, 4};

    assertFalse(jumpGame.canJump(nums));
  }

  @Test
  void testCanJump3() {
    int[] nums = {2};

    assertTrue(jumpGame.canJump(nums));
  }

  @Test
  void testCanJump4() {
    int[] nums = {0};

    assertTrue(jumpGame.canJump(nums));
  }
}