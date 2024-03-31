package com.org.ds.v3.lohia.string;

/**
 * Given two strings str1 and str2. Write a function to determine if str1 is an anagram of str2.
 *
 * Example 1:
 * str1 = “listen”, str2 = “silent”
 * Output = True
 *
 * Example 2:
 * str1 = “mississippi”, str2 = “mips”
 * Output = False
 *
 * https://www.youtube.com/watch?v=y6ht-CoRI4Q&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=3
 * TC: O(n) SC: O(1)
 */
class C3_ValidAnagram {

  public boolean isAnagram(String str1, String str2) {

    // Convert both to lowercase to ignore case match
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Strip of all the white spaces
    str1 = str1.replace(" ", "");
    str2 = str2.replace(" ", "");

    // Initialize the bucket array
    int[] counts = new int[26];

    // Fill the buckets
    for (int i = 0; i < str1.length(); i++) {
      counts[str1.charAt(i) - 'a']++;
    }

    // Empty the buckets
    for (int i = 0; i < str2.length(); i++) {
      counts[str2.charAt(i) - 'a']--;
    }

    // Check if all buckets are empty
    for (int count : counts) {
      if (count != 0)
        return false;
    }

    return true;
  }

}