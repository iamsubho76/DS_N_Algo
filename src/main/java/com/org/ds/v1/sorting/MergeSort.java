package com.org.ds.v1.sorting;

/**
 * Time Complexity: O(n log(n)) for all cases
 * Space Complexity: O(n) for the auxiliary array
 *
 * https://www.youtube.com/watch?v=-qjc4fYsZTU&list=PLFdAYMIVJQHNJnCK8XopkeyaZqneVZzrO&index=5
 */
public class MergeSort {

    private int[] nums;
    private int[] tempArray;

    public MergeSort(int[] nums) {
        this.nums = nums;
        tempArray = new int[nums.length];
    }

    public void mergeSort(int low, int high) {

        if (low >= high) {
            return;
        }

        int middle = (low + high) / 2;

        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    public void showResult() {
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i] + " ");
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy nums[i] -> temp[i]
        for (int i = low; i <= high; i++) {
            tempArray[i] = nums[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while ((i <= middle) && (j <= high)) {
            if (tempArray[i] <= tempArray[j]) {
                nums[k] = tempArray[i];
                i++;
            } else {
                nums[k] = tempArray[j];
                j++;
            }
            
            k++;
        }
        
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            nums[k] = tempArray[i];
            k++;
            i++;
        }
		
		// Copy the rest of the right side of the array into the target array
        while (j <= high) {
            nums[k] = tempArray[j];
            k++;
            j++;
        }
    }
    
    public static void main(String[] args) {

        int[] nums = { 1,2,3,1,2,3 };

        MergeSort mergeSort = new MergeSort(nums);
        mergeSort.mergeSort(0, nums.length - 1);
        mergeSort.showResult();
    }
}
