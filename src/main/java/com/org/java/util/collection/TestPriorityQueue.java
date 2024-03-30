package com.org.java.util.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

    public static void main(String[] args) {

        // primitive types
//        Queue<String> pQueue = new PriorityQueue<>();
//
//        pQueue.add("F");
//        pQueue.add("C");
//        pQueue.add("Z");
//        pQueue.add("A");
//
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.remove());

        // custom objects
        Queue<PersonPriorityQueue> queue = new PriorityQueue<>();
        queue.add(new PersonPriorityQueue("Balazs", 55));
        queue.add(new PersonPriorityQueue("Adam", -1));
        queue.add(new PersonPriorityQueue("Joe", 123));
        queue.add(new PersonPriorityQueue("Agi", 37));
        
        // O(logN)

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
