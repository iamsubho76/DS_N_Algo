package com.org.ds.v3.lohia;

public class s5_max_subarray {
    public static void main(String[] args) {
        System.out.println(s5_max_subarray.maxSubArray());
    }

    // TC: O(n), SC: O(1)
    public static int maxSubArray() {
        int[] nums = {};
        int curr = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(max, curr);
        }
        return max;
    }
}
