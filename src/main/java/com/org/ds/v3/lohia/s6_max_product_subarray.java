package com.org.ds.v3.lohia;

// Follow this https://www.youtube.com/watch?v=Y6B-7ZctiW8
public class s6_max_product_subarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(s6_max_product_subarray.maxProduct(nums));

        int[] numsV2 = {-2, 0, -1};
        System.out.println(s6_max_product_subarray.maxProduct(numsV2));

        int[] numsV3 = {2, 3, -2, -5, 6, -1, 4};
        System.out.println(s6_max_product_subarray.maxProduct(numsV3));

        int[] numsV4 = {0, 0};
        System.out.println(s6_max_product_subarray.maxProduct(numsV4));
    }

//    // TC: O(n), SC: O(1)
//    public static int maxProduct() {
//        //input
//        int[] nums = {};
//
//        //solution
//        int ans = nums[0];
//
//        int min = 1, max = 1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {  // -2, 0, -1
//                min = 1;
//                max = 1;
//                ans = Math.max(ans, nums[i]);
//                continue;
//            }
//
//            int tmp = min;
//            min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * max));
//            max = Math.max(nums[i], Math.max(nums[i] * tmp, nums[i] * max));
//            ans = Math.max(ans, max);
//        }
//
//        return ans;
//    }

    public static int maxProduct(int[] nums){
        // solution
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {

            //if any of leftProduct or rightProduct become 0 then update it to 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            //prefix product
            leftProduct *= nums[i];

            //suffix product
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return ans;
    }
}
