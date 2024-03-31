package com.org.ds.v3.lohia.string;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/partition-labels/description/
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 *
 * Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
 *
 * Return a list of integers representing the size of these parts.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 * Example 2:
 *
 * Input: s = "eccbbbbdec"
 * Output: [10]
 *
 * https://www.youtube.com/watch?v=aUVEMnlcw4E&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=12
 */

class C10_PartitionLabels {

  public List<Integer> partitionLabels(String str) {

    List<Integer> partitions = new ArrayList<>();

    for (int i = 0; i < str.length(); ) {

      // Get first and last index of first character
      int startIndex = i;
      int endIndex = str.lastIndexOf(str.charAt(startIndex));

      for (int s = startIndex + 1; s <= endIndex - 1; s++) {

        // Find last index of any subsequent characters
        int lastIndexOfNextChar = str.lastIndexOf(str.charAt(s));

        if (lastIndexOfNextChar > endIndex) {
          // Update endIndex if required
          endIndex = lastIndexOfNextChar;
        }
      }

      partitions.add(endIndex - startIndex + 1);
      i = endIndex + 1;
    }

    return partitions;
  }
}