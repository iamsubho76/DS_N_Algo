package com.org.ds.v1.array;

public class D4_2_FindFirstLastPositionsElementUnsortedArray {

    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        // Find the first occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && first == -1) {
                first = i;
            }
            if (nums[i] == target) {
                last = i;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {5, -7, 2, 7, 8, 10, 5, 9, 6, 25, 55, 7, 89, 65, 44, -7, 56, 89};
        int target = -7;
        int[] result = searchRange(nums, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("First occurrence of " + target + " is at index " + result[0]);
            System.out.println("Last occurrence of " + target + " is at index " + result[1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
