package com.org.ds.v1.array;

import java.util.Arrays;

/**
 * Problem :- Check if the array is balanced array or not.
 * Description:- A balanced array is defined to be an array where for every value n in the array,
 * -n also is in the array.
 *
 * Example 1:- {-2, 3, 2, -3} is a balanced array.
 * Example 2:- {1,1,-1,-1} is a balanced array.
 * Example 3:- {1,1,-1} is a NOT balanced array.
 * Example 4:- {-2, 3, 2, -3, 0, 5,-5} is a balanced array.
 * Example 5:- {1, 2, -3} is NOT a balanced array.
 * Example 6:- {-3,-2, -3, -2, 4, 1, 4, 1 , 3, 2, -4, -1} is NOT a balanced array
 * Example 7:- {1,1,-1,-1, 1} - is NOT a balanced array
 * Note:-
 * Zeroes can be ignored.
 * There can be duplicates in the array. Every duplicate n needs to have -n
 */
public class D14_FindBalancedArrayOfPstvNegtvNum {
    public static void main(String[] args) {
        int[] array1 = {-2, 3, 2, -3};
        int[] array2 = {1, 1, -1, -1};
        int[] array3 = {1, 1, -1};
        int[] array4 = {-2, 3, 2, -3, 0, 5, -5};
        int[] array5 = {1, 2, -3};
        int[] array6 = {-3, -2, -3, -2, 4, 1, 4, 1, 3, 2, -4, -1};
        int[] array7 = {1, 1, -1, -1, 1};

        //true
        System.out.println("Array 1 is balanced: " + isBalanced(array1));
        //true
        System.out.println("Array 2 is balanced: " + isBalanced(array2));
        //false
        System.out.println("Array 3 is balanced: " + isBalanced(array3));
        //true
        System.out.println("Array 4 is balanced: " + isBalanced(array4));
        //false
        System.out.println("Array 5 is balanced: " + isBalanced(array5));
        //false
        System.out.println("Array 6 is balanced: " + isBalanced(array6));
        //false
        System.out.println("Array 7 is balanced: " + isBalanced(array7));
    }

    public static boolean isBalanced(int[] array) {
        int targetSum = 0;
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        int sum =0;
        while (left <= right) {
            sum = array[left] + array[right];
            if (sum == targetSum) {
                left++;
                right --;
                continue;
            }
            break;
        }
        return sum == targetSum;
    }
}
