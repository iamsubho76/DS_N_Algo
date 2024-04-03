package com.org.ds.v3.lohia.array;

import java.util.List;

/**
 * Created by nikoo28 on 2/14/21 1:08 AM
 */

public class C12_DF_BirthdayCakeCandles {

  int birthdayCakeCandles(List<Integer> candles) {

    int maximum = Integer.MIN_VALUE;

    // Get the height of the tallest candle
    for (Integer candle : candles) {
      if (candle >= maximum)
        maximum = candle;
    }

    // Count how many tallest candles are present
    int result = 0;
    for (Integer candle : candles) {
      if (candle == maximum)
        result++;
    }

    return result;
  }

  int birthdayCakeCandlesStream(List<Integer> candles) {

    int maximum = Integer.MIN_VALUE;
    int result = 0;

    for (Integer candle : candles) {
      if (candle < maximum)
        continue;
      if (candle == maximum)
        result++;
      if (candle > maximum) {
        result = 1;
        maximum = candle;
      }
    }

    return result;
  }

}