package com.org.ds.v1.array;
//https://www.geeksforgeeks.org/find-subarray-with-given-sum/?ref=roadmap

import java.util.*;

public class D6_FindSubarrayForGivenSum {
    public static List<Integer>
    findSubarrayWithGivenSum(List<Integer> arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> subarray = new ArrayList<>();
        int currSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            currSum += arr.get(i);
            if (map.containsKey(currSum - sum)) {
                subarray = arr.subList(
                        map.get(currSum - sum) + 1, i + 1);
                break;
            }
            map.put(currSum, i);
        }
        return subarray;
    }

    public static void main(String[] args) {
        List<Integer> arr
                = Arrays.asList(15, 2, 4, 8, 9, 5, 10, 23);
        List<Integer> subarray
                = findSubarrayWithGivenSum(arr, 23);
        if (subarray.isEmpty()) {
            System.out.println(
                    "No subarray with given sum found");
        } else {
            System.out.print("Subarray: [ ");
            for (int i : subarray) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }
}
