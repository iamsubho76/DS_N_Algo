package com.org.ds.stack;

public class TestStackByLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackByLinkedList<Integer> stack = new StackByLinkedList<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());

	}

}
