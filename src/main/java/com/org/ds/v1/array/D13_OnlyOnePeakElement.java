package com.org.ds.v1.array;

//https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/?ref=roadmap

// A Java program to find a peak
// element using divide and conquer

class D13_OnlyOnePeakElement {
    // A binary search based function
    // that returns index of a peak element
    static int findPeakUtil(
            int arr[], int low, int high, int n) {
        // Find index of middle element
        // low + (high - low) / 2
        int mid = low + (high - low) / 2;

        // Compare middle element with its
        // neighbours (if neighbours exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
                && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

            // If middle element is not peak
            // and its left neighbor is
            // greater than it, then left half
            // must have a peak element
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

            // If middle element is not peak
            // and its right neighbor
            // is greater than it, then right
            // half must have a peak
            // element
        else
            return findPeakUtil(
                    arr, (mid + 1), high, n);
    }

    // A wrapper over recursive function
    // findPeakUtil()
    static int findPeak(int arr[], int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }

    // Driver method
    public static void main(String[] args) {
//        int arr[] = {1, 3, 20, 4, 1, 0};
//        int n = arr.length;
//        System.out.println(
//                "Index of a peak point is " + findPeak(arr, n));

        int arr1[] = {1, 3, 20, 4, 1, 0, 18, 9, 8, 2, 77, 86, 1024, 98, 658, 87};
        int n1 = arr1.length;
        System.out.println(
                "Index of a peak point is " + findPeak(arr1, n1));
    }
}
