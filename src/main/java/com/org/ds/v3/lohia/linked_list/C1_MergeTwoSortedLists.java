package com.org.ds.v3.lohia.linked_list;

/**
 * Problem - Merge Two Sorted Lists [https://leetcode.com/problems/merge-two-sorted-lists/description/]
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * https://www.youtube.com/watch?v=0ougDTvVOFI&list=PLFdAYMIVJQHN6J5-OCh7pbG0o8WHC9so3&index=5
 * TC::O(n)  SC:: O(n)
 */
public class C1_MergeTwoSortedLists {
    public static SinglyLinkedList mergeTwoLists(SinglyLinkedList l1, SinglyLinkedList l2) {

        // Create a sentinal/dummy node to start
        SinglyLinkedList returnNode = new SinglyLinkedList(Integer.MIN_VALUE);

        // Create a copy of this node to iterate while solving the problem
        SinglyLinkedList headNode = returnNode;

        // Traverse till one of the list reaches the end
        while (l1 != null && l2 != null) {

            // Compare the 2 values of lists
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }

        // Append the remaining list
        if (l1 == null) {
            returnNode.next = l2;
        } else if (l2 == null) {
            returnNode.next = l1;
        }

        // return the next node to sentinal node
        return headNode.next;
    }

}