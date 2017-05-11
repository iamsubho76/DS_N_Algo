package com.org.java.util.collection;

import java.util.Stack;

public class TestStack {

	/**
	*	A Stack is a Data Structure where you add element at the "top" of the Stack
	*		and also remove element from the "top"
	*
	*	Last In First Out (LIFO)
	*	Stack's are really good for some type of Data Processing
	*	for example if you are parsing an XML file using SAX or STAX parser
	*
	*	push() method push the object onto the top of the Stack
	*
	*	peek() method returned the object from top of the Stack but doesn't remove the object
	*
	*	pop() method returns the object at the top of the Stack, and remove the object from the Stack
	*
	*	Application - for example Graph traversing with depth-first search
	*/
	public static void main(String[] args) {
		Stack<Integer> stack =  new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		//As because Stack is Collection so we can traverse like below way
		for(Integer i : stack){
			System.out.println(i);
		}
	}
}
