package com.org.ds.stack;

public class StackByLinkedList<T extends Comparable<T>> {

	private NodeByLinkedList<T> root;
	private int count;
	
	// O(1) constant time
	public void push(T newData){
		
		this.count++;
		
		if( this.root == null ){
			this.root = new NodeByLinkedList<>(newData);
		}else{
			NodeByLinkedList<T> oldRoot = this.root;
			this.root = new NodeByLinkedList<>(newData);
			this.root.setNextNode(oldRoot);
		}
	}
	
	// O(1)
	public int size(){
		return this.count;
	}
	
	//O(1)
	public T peek(){
		return this.root.getData();
	}
	
	// O(1)
	public T pop(){
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode();
		this.count--;
		return itemToPop;
	}

	// O(1) constant time
	public boolean isEmpty(){
		return this.root == null;
	}
}
