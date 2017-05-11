package com.org.ds.stack;

public class NodeByLinkedList<T extends Comparable<T>> {

	private T data;
	private NodeByLinkedList<T> nextNode;
	
	public NodeByLinkedList(T data){
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeByLinkedList<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeByLinkedList<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
