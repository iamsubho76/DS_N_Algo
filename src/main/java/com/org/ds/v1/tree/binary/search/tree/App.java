package com.org.ds.v1.tree.binary.search.tree;

public class App {

	public static void main(String[] args) {
		
		Tree<Integer> iTree = new BinarySearchTree<>();
		iTree.insert(10);
		iTree.insert(20);
		iTree.insert(30);
		iTree.insert(40);
		iTree.insert(50);
		
		// O(N)   OR  O(logN)
		Tree<Person> bst = new BinarySearchTree<>();
		
		bst.insert(new Person("Adam",27));
		bst.insert(new Person("Kevin",13));
		bst.insert(new Person("Joe",67));
		bst.insert(new Person("Michael",2));
		bst.insert(new Person("Smith",11));
		
		bst.traversal();
		
	}
}
