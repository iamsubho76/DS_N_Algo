package com.org.ds.v1.tree.avl.generic;

public class App {

	public static void main(String[] args) {

		Tree<String> avl = new AvlTree<>();

		avl.insert("a");
		avl.insert("c");
		avl.insert("b");

		//avl.delete(5);
		
		avl.traverse();
	}
	
}
