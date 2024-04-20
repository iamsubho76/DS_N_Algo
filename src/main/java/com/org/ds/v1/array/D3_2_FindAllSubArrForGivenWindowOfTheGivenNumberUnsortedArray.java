package com.org.ds.v1.array;

import java.util.ArrayList;
import java.util.List;

public class D3_2_FindAllSubArrForGivenWindowOfTheGivenNumberUnsortedArray {

    public static List<List<Integer>> findElementsWithSum(int[] arr, int target, int k) {
        List<List<Integer>> result = new ArrayList<>();
        findElements(arr, target, k, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findElements(int[] arr, int target, int k, int start, List<Integer> currentList, List<List<Integer>> result) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if (k == 0 || target <= 0 || start == arr.length) {
            return;
        }
        // Include the current element
        currentList.add(arr[start]);
        findElements(arr, target - arr[start], k - 1, start + 1, currentList, result);
        currentList.remove(currentList.size() - 1);
        // Exclude the current element
        findElements(arr, target, k, start + 1, currentList, result);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 4, 8, 9, 2, 6};
        int target = 10;
        int k = 5; // Summation of 3 elements
        List<List<Integer>> elementsWithSum = findElementsWithSum(array, target, k);

        if (elementsWithSum.isEmpty()) {
            System.out.println("No elements found with the summation equivalent to the given number.");
        } else {
            System.out.println("Elements with summation equivalent to " + target + ":");
            for (List<Integer> combination : elementsWithSum) {
                System.out.println(combination);
            }
        }
    }
}
