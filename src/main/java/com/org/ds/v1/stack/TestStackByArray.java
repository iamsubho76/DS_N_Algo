package com.org.ds.v1.stack;

public class TestStackByArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackByArray<String> stack = new StackByArray<>();
		
		stack.push("Admin1");
		stack.push("Admin2");
		stack.push("Admin3");
		stack.push("Admin4");
		stack.push("Admin5");
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());

		System.out.println(stack.size());
		
	}

}
