package com.org.ds.v1.tree.splay_tree;

public interface Tree<T extends Comparable<T>> {
	public void insert(T data);
	public Node<T> find(T data);
	public T getMin();
	public T getMax();
	public void inOrderTraversal();
}
