package com.org.ds.v3.lohia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class s3_contains_duplicate {
    public static void main(String[] args) {
        s3_contains_duplicate.containsDuplicate();
        s3_contains_duplicate.findAllDuplicates();
    }

    // TC: O(n), SC: O(n)
    public static boolean containsDuplicate() {
        int[] nums = {1,8,5,3,75,8};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                System.out.println(nums[i] + " this is duplicate");
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    // leetcode-442 | Find All Duplicates in an Array
//    Given an integer array nums of length n where all the integers of
//    nums are in the range [1, n] and each integer appears once or twice,
//    return an array of all the integers that appears twice.
//
//    You must write an algorithm that runs in O(n) time and uses only constant
//    extra space.
//
//    Example 1:
//    Input: nums = [4,3,2,7,8,2,3,1]
//    Output: [2,3]
    // https://www.youtube.com/watch?v=ACYunkWQnSI
    // TC: O(n), SC: O(1)
    public static List<Integer> findAllDuplicates() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(nums[i]));
            nums[index] = -nums[index];
        }
        return res;
    }
}
