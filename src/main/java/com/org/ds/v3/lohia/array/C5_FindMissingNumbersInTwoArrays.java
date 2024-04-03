package com.org.ds.v3.lohia.array;

import java.util.Map;
import java.util.TreeMap;

/**
 * Question: You are required to find missing numbers that are left out while an artist transports numbers from one array to other. The output array should be sorted.
 *
 * Input:
 * arr [ ] = {7, 2, 5, 3, 5, 3}
 * brr [ ] = {7, 2, 5, 4, 6, 3, 5, 3}
 *
 * Output:
 * Missing numbers: {4, 6}
 *
 * https://www.youtube.com/watch?v=1g3WmjMG2OM&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=6
 */

public class C5_FindMissingNumbersInTwoArrays {

  public int[] missingNumbers(int[] arr, int[] brr) {

    TreeMap<Integer, Integer> integerFreqMap = new TreeMap<>();

    // Add elements of original list
    for (int i : brr) {
      int freq = integerFreqMap.getOrDefault(i, 0);
      freq++;
      integerFreqMap.put(i, freq);
    }

    // Remove elements of new list
    for (int i : arr) {
      int freq = integerFreqMap.get(i);
      freq--;
      if (freq == 0)
        integerFreqMap.remove(i);
      else
        integerFreqMap.put(i, freq);
    }

    // Create the result array
    int[] result = new int[integerFreqMap.size()];
    int i = 0;
    for (Map.Entry<Integer, Integer> integerIntegerEntry : integerFreqMap.entrySet()) {
      result[i++] = integerIntegerEntry.getKey();
    }

    return result;
  }

}