package com.org.ds.v3.lohia.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * Question: You need to count the number of tallest candles on the cake,
 * where below number defines the height of the candle
 *
 * Input: candles = [4, 4, 1, 3]
 *
 * Output: 2
 */

class BirthdayCakeCandlesTest {

  private final C12_BirthdayCakeCandles birthdayCakeCandles;

  public BirthdayCakeCandlesTest() {
    birthdayCakeCandles = new C12_BirthdayCakeCandles();
  }

  @Test
  void testBirthdayCakeCandles1() {
    List<Integer> candles = new ArrayList<>();
    candles.add(3);
    candles.add(2);
    candles.add(1);
    candles.add(3);

    assertEquals(2, birthdayCakeCandles.birthdayCakeCandles(candles));
    assertEquals(2, birthdayCakeCandles.birthdayCakeCandlesStream(candles));
  }

  @Test
  void testBirthdayCakeCandles2() {
    List<Integer> candles = new ArrayList<>();
    candles.add(4);
    candles.add(4);
    candles.add(1);
    candles.add(3);

    assertEquals(2, birthdayCakeCandles.birthdayCakeCandles(candles));
    assertEquals(2, birthdayCakeCandles.birthdayCakeCandlesStream(candles));
  }
}