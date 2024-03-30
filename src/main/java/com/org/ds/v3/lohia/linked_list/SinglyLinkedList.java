package com.org.ds.v3.lohia.linked_list;

/**
 * Created by nikoo28 on 12/17/17 10:41 PM
 */

public class SinglyLinkedList {
    public int val;
    public SinglyLinkedList next;

    public SinglyLinkedList(int x) {
        val = x;
    }

    public static void main(String[] args) {

        // Create 3 nodes
        SinglyLinkedList l1 = new SinglyLinkedList(4);
        SinglyLinkedList l2 = new SinglyLinkedList(8);
        SinglyLinkedList l3 = new SinglyLinkedList(15);

        // Link the nodes
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        // Print values
        SinglyLinkedList ptr = l1;
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }

    /**
     *
     * @param head
     * @param valToInsert
     * @return
     */
    public SinglyLinkedList insertAtBeginning(SinglyLinkedList head, int valToInsert) {

        // Create a node to insert
        SinglyLinkedList newNode = new SinglyLinkedList(valToInsert);

        // Assign the next of this node to head
        newNode.next = head;

        // Point the head of the list to this new node
        head = newNode;

        return head;
    }

    public SinglyLinkedList insertAtEnd(SinglyLinkedList head, int valToInsert) {

        // Create a node to insert
        SinglyLinkedList newNode = new SinglyLinkedList(valToInsert);

        // Goto the end of the list
        SinglyLinkedList ptr = head;
        while (ptr.next != null)
            ptr = ptr.next;

        // Assign the newNode at the end of the list
        ptr.next = newNode;

        // Return original head
        return head;
    }

    public SinglyLinkedList insertInMiddle(SinglyLinkedList head, int valToInsert, int position) {

        // Create a node to insert
        SinglyLinkedList newNode = new SinglyLinkedList(valToInsert);

        // Move to the position
        SinglyLinkedList ptr = head;
        for (int i = 0; i < position; i++) {
            ptr = ptr.next;
        }

        // Insert the node
        newNode.next = ptr.next;
        ptr.next = newNode;

        // Return original head
        return head;
    }

    public SinglyLinkedList deleteFromBeginning(SinglyLinkedList head) {

        // Just move the head to the next position
        head = head.next;

        // Return the new head
        return head;
    }

    public SinglyLinkedList deleteAtEnd(SinglyLinkedList head) {

        // Move to the second last node
        SinglyLinkedList ptr = head;
        while (ptr.next.next != null)
            ptr = ptr.next;

        // Point the next of second last node to null
        ptr.next = null;

        // Return original head
        return head;
    }

    public SinglyLinkedList deleteFromMiddle(SinglyLinkedList head, int position) {

        // Move to previous position of node to delete
        SinglyLinkedList ptr = head;
        for (int i = 0; i < position - 1; i++) {
            ptr = ptr.next;
        }

        // Get the node to delete
        SinglyLinkedList nodeToDelete = ptr.next;

        // Get the address of node next to the node to be deleted
        SinglyLinkedList nextNode = nodeToDelete.next;

        // Point the next of ptr to nextNode
        ptr.next = nextNode;

        // Return the original head
        return head;
    }

    /**
     * TC:: O(n) SC:: O(1)
     * @param head
     */
    public void traverseALinkedList(SinglyLinkedList head) {

        SinglyLinkedList temp = head;

        // Run a loop until you reach null
        while (temp != null) {

            // Print the first value
            System.out.println(temp.val);

            // Move to the next node
            temp = temp.next;
        }
    }
}