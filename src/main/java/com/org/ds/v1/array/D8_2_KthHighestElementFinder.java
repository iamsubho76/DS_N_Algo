package com.org.ds.v1.array;

public class D8_2_KthHighestElementFinder {
    public static void main(String[] args) {
        int[] arr = {12, 19, 20, 88, 0, 9};
        int k = 5; // kth highest element to find

        int kthHighest = findKthHighest(arr, k);
        System.out.println("The " + k + "th highest element is: " + kthHighest);
    }

    public static int findKthHighest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input or kth value");
        }

        return quickSelect(arr, 0, arr.length - 1, arr.length - k);
    }

    private static int quickSelect(int[] arr, int low, int high, int k) {
        int pivotIndex = partition(arr, low, high);

        if (pivotIndex == k) {
            return arr[pivotIndex];
        } else if (pivotIndex < k) {
            return quickSelect(arr, pivotIndex + 1, high, k);
        } else {
            return quickSelect(arr, low, pivotIndex - 1, k);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
