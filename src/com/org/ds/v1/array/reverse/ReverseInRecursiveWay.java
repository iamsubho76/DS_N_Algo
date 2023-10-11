package com.org.ds.v1.array.reverse;

// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/?ref=roadmap


/**
 * Recursive Way :
 * 1) Initialize start and end indexes as start = 0, end = n-1
 * 2) Swap arr[start] with arr[end]
 * 3) Recursively call reverse for rest of the array.
 * <p>
 * Below is the implementation of the above approach :
 * Output :
 * <p>
 * 1 2 3 4 5 6
 * Reversed array is
 * 6 5 4 3 2 1
 * Time Complexity: O(n)
 * Auxiliary Space: O(n)
 */
public class ReverseInRecursiveWay {

    /* Function to reverse arr[] from
     start to end*/
    static void rvereseArray(int[] arr,
                             int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /* Utility that prints out an
    array on a line */
    static void printArray(int[] arr,
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);

    }
}