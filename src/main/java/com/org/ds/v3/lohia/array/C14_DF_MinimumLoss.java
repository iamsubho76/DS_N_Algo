package com.org.ds.v3.lohia.array;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/minimum-loss/problem
 * Lauren has a chart of distinct projected prices for a house over the next several years. She must buy the house in one year and sell it in another, and she must do so at a loss. She wants to minimize her financial loss.
 *
 * Example
 * price = [20, 15, 8, 2, 12]
 *
 * Her minimum loss is incurred by purchasing in year 2 at price[1]=15 and reselling in year 5 at price[4]=12.
 * Return 15-12=3.
 *
 * Function Description
 *
 * Complete the minimumLoss function in the editor below.
 *
 * minimumLoss has the following parameter(s):
 *
 * int price[n]: home prices at each year
 * Returns
 *
 * int: the minimum loss possible
 *
 * ample Input 0
 *
 * 3
 * 5 10 3
 * Sample Output 0
 *
 * 2
 *
 *
 * Sample Input 1
 *
 * 5
 * 20 7 8 2 5
 * Sample Output 1
 *
 * 2
 *
 * https://www.youtube.com/watch?v=X6DqnrpjEWA&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=14
 */

//this is HARD problem
public class  C14_DF_MinimumLoss {

  public int minimumLoss(List<Long> prices) {

    // Index all the elements
    Map<Long, Integer> priceIndexMap = new HashMap<>();
    for (int i = 0; i < prices.size(); i++) {
      priceIndexMap.put(prices.get(i), i);
    }

    Collections.sort(prices);
    long minimumLoss = Long.MAX_VALUE;

    // Start from the end
    for (int i = prices.size() - 1; i > 0 ; i--) {

      // Reject the invalid values 💣
      if (priceIndexMap.get(prices.get(i)) >
          priceIndexMap.get(prices.get(i-1)))
        continue;

      long dayLoss = prices.get(i) - prices.get(i-1);
      minimumLoss = Math.min(dayLoss, minimumLoss);
    }

    return (int) minimumLoss;
  }

}