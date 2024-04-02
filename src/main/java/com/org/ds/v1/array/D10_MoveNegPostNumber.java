package com.org.ds.v1.array;

//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/?ref=roadmap

/**
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
 * <p>
 * Examples :
 * <p>
 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 * <p>
 * Note: Order of elements is not important here.
 * <p>
 * Output
 * -12 -3 -13 -5 -7 6 5 11 11
 * This is an in-place rearranging algorithm for arranging the positive and negative numbers where the order of elements is not maintained.
 * Time Complexity: O(N)
 * Auxiliary Space: O(1)
 */
// Java program of the above
// approach

class D10_MoveNegPostNumber {

    // Function to shift all the
// negative elements on left side
    static void shiftall(int[] arr, int left,
                         int right) {

        // Loop to iterate over the
        // array from left to the right
        while (left <= right) {

            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[left] < 0 && arr[right] < 0)
                left++;

                // Condition to check if the left
                // pointer element is positive and
                // the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // Condition to check if both the
            // elements are positive
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else {
                left++;
                right--;
            }
        }
    }

    // Function to print the array
    static void display(int[] arr, int right) {

        // Loop to iterate over the element
        // of the given array
        for (int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Drive code
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};

        int arr_size = arr.length;

        // Function Call
        shiftall(arr, 0, arr_size - 1);
        display(arr, arr_size - 1);
    }
}

// This code is contributed by dhruvgoyal267
