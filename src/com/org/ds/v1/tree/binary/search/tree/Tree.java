package com.org.ds.v1.tree.binary.search.tree;

public interface Tree<T> {
	public void traversal();
	public void insert(T data);
	public void delete(T data);
	public T getMaxValue();
	public T getMinValue();
}
