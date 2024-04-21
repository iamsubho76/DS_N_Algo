package com.org.ds.v1.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindLoopInLinkedList {
    Node head;

    FindLoopInLinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast pointers meet at some point, then there is a loop
            if (slow == fast) {
                return true;
            }
        }
        // If the fast pointer reaches the end of the list, there is no loop
        return false;
    }

    public static void main(String[] args) {
        FindLoopInLinkedList list = new FindLoopInLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Create a loop in the linked list (for demonstration)
        list.head.next.next.next.next.next = list.head.next;

        if (list.hasLoop()) {
            System.out.println("Loop found in the linked list");
        } else {
            System.out.println("No loop found in the linked list");
        }
    }
}
