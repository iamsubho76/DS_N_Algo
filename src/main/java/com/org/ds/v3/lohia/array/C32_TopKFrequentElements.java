package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * https://www.youtube.com/watch?v=EBNPu0GgM64&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=33
 */
public class C32_TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {

    List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int n : nums) {
      frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    for (int key : frequencyMap.keySet()) {
      int frequency = frequencyMap.get(key);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    List<Integer> topK = new ArrayList<>();
    for (int pos = bucket.length - 1;pos >= 0 && topK.size() < k; pos--) {
      if (bucket[pos] != null) {
        topK.addAll(bucket[pos]);
      }
    }

    return topK.stream().mapToInt(i -> i).toArray();

  }

}