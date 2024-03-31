package com.org.ds.v3.lohia.string;

import java.util.*;

/**
 * Question: Given an array of strings strs, you need to group all the anagrams together.
 * You can return the answer in any order.
 *
 * Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
 *
 * https://www.youtube.com/watch?v=C9V66KyZCP8&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=7
 */
class C7_GroupAnagrams {

  public List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {

    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    Map<String, List<String>> stringAnagramsMap = new HashMap<>();
    for (String s : strs) {
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String key = String.valueOf(arr);

      if (!stringAnagramsMap.containsKey(key))
        stringAnagramsMap.put(key, new ArrayList<>());

      stringAnagramsMap.get(key).add(s);
    }

    List<List<String>> resultList = new ArrayList<>();
    for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
      resultList.add(stringAnagrams.getValue());
    }
    return resultList;
  }

  public List<List<String>> groupAnagramsCategorizeByFrequency(String[] strs) {

    // Check for empty inputs
    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    Map<String, List<String>> frequencyStringsMap = new HashMap<>();
    for (String str : strs) {

      String frequencyString = getFrequencyString(str);

      // If the frequency string is present, add the string to the list
      if (frequencyStringsMap.containsKey(frequencyString)) {
        frequencyStringsMap.get(frequencyString).add(str);
      }
      else {
        // else create a new list
        List<String> strList = new ArrayList<>();
        strList.add(str);
        frequencyStringsMap.put(frequencyString, strList);
      }
    }

    return new ArrayList<>(frequencyStringsMap.values());
  }

  private String getFrequencyString(String str) {

    // Frequency buckets
    int[] freq = new int[26];

    // Iterate over each character
    for (char c : str.toCharArray()) {
      freq[c - 'a']++;
    }

    // Start creating the frequency string
    StringBuilder frequencyString = new StringBuilder("");
    char c = 'a';
    for (int i : freq) {
      frequencyString.append(c);
      frequencyString.append(i);
      c++;
    }

    return frequencyString.toString();
  }
}