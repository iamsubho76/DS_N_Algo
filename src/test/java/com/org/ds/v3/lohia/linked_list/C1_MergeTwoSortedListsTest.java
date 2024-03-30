package com.org.ds.v3.lohia.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C1_MergeTwoSortedListsTest {

    C1_MergeTwoSortedLists mergeTwoSortedLists = new C1_MergeTwoSortedLists();

    @Test
    void testMergeTwoLists1() {
        SinglyLinkedList l1 = new SinglyLinkedList(1);
        l1.next = new SinglyLinkedList(2);
        l1.next.next = new SinglyLinkedList(4);

        SinglyLinkedList l2 = new SinglyLinkedList(1);
        l2.next = new SinglyLinkedList(3);
        l2.next.next = new SinglyLinkedList(4);

        SinglyLinkedList SinglyLinkedList = C1_MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(1, SinglyLinkedList.val);
        assertEquals(1, SinglyLinkedList.next.val);
        assertEquals(2, SinglyLinkedList.next.next.val);
        assertEquals(3, SinglyLinkedList.next.next.next.val);
        assertEquals(4, SinglyLinkedList.next.next.next.next.val);
        assertEquals(4, SinglyLinkedList.next.next.next.next.next.val);
    }

    @Test
    void testMergeTwoLists2() {
        SinglyLinkedList l1 = null;

        SinglyLinkedList l2 = new SinglyLinkedList(2);
        l2.next = new SinglyLinkedList(3);
        l2.next.next = new SinglyLinkedList(4);

        SinglyLinkedList SinglyLinkedList = C1_MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(2, SinglyLinkedList.val);
        assertEquals(3, SinglyLinkedList.next.val);
        assertEquals(4, SinglyLinkedList.next.next.val);
    }

    @Test
    void testMergeTwoNullLists2() {
        SinglyLinkedList l1 = null;

        SinglyLinkedList l2 = null;

        SinglyLinkedList SinglyLinkedList = C1_MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertNull(SinglyLinkedList);
    }
}