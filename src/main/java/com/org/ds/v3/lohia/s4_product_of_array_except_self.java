package com.org.ds.v3.lohia;

import java.util.Arrays;

// Leetcode-238
// we will use prefix-product and suffix-product of an array
// N.B:: this can be done using dynamic-programming too
public class s4_product_of_array_except_self {
    public static void main(String[] args) {
        Arrays.stream(s4_product_of_array_except_self.productExceptSelf()).forEach(System.out::println);
    }

    public static int[] productExceptSelf() {
        //input
        int[] nums = {1,2,3,4};
        //solution
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        int suffixProduct = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            prefixProduct[i] = prefixProduct[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return prefixProduct;
    }
}
