package com.org.ds.v1.searching.find_Second_largest_element_in_an_array;

//https://www.geeksforgeeks.org/find-second-largest-element-array/
//Find Second largest element in an array

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array.
 * <p>
 * Example:
 * <p>
 * Input: arr[] = {12, 35, 1, 10, 34, 1}
 * Output: The second largest element is 34.
 * Explanation: The largest element of the
 * array is 35 and the second
 * largest element is 34
 * Input: arr[] = {10, 5, 10}
 * Output: The second largest element is 5.
 * Explanation: The largest element of
 * the array is 10 and the second
 * largest element is 5
 * Input: arr[] = {10, 10, 10}
 * Output: The second largest does not exist.
 * Explanation: Largest element of the array
 * is 10 there is no second largest element
 * <p>
 * Approach for finding the second largest element using the priority queue data structure
 * <p>
 * So in the priority queue, top element is the largest among all the elements that are present in that priority queue.
 * <p>
 * So here we will push all elements into a priority queue. Now its top element will be the largest element, so we will pop the top element. Now the element present at the top is the second largest element. So we will simply print that.
 * <p>
 * Code-
 */
public class FindSecondLargestElementInAnArray {
    public static void main(String[] args) {
        // Given vector
        List<Integer> v
                = Arrays.asList(12, 35, 1, 10, 34, 1);
        // Made a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Collections.reverseOrder());
        // inserting all the element from vector v to
        // priority queue pq.
        for (int i = 0; i < v.size(); i++) {
            pq.add(v.get(i));
        }

        // Remove largest element from pq
        pq.poll();

        // Now top of priority queue is second largest
        // element
        System.out.println(
                "The Second Largest Element in Vector is: "
                        + pq.peek());
    }
}
/**
 * Output
 * The Second Largest Element in Vector is: 34
 * <p>
 * Time Complexity: O(nlogn)
 * Auxiliary Space: O(n), for priority queue
 */