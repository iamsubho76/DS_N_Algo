package com.org.ds.v3.lohia.array;

import java.util.ArrayList;
import java.util.List;

public class C21_2_LeftRightAdjacentSmallerNeighbors {
    public static void main(String[] args) {
        int[] nums = {8, 5, 6, 7, 8, 6, 9, 8, 10};

        List<int[]> result = findLeftRightAdjacentSmallerNeighbors(nums);

        System.out.println("Elements with left and right adjacent smaller neighbors:");
        for (int[] pair : result) {
            System.out.println("Element: " + pair[0] + " smaller for:: as Right Neighbor of: " + pair[1] + ", as Left Neighbor of: " + pair[2]);
        }
    }

    public static List<int[]> findLeftRightAdjacentSmallerNeighbors(int[] nums) {
        List<int[]> result = new ArrayList<>();

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                result.add(new int[]{nums[i], nums[i - 1], nums[i + 1]});
            }
        }

        return result;
    }
}
