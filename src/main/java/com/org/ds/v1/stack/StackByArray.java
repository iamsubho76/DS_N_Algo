package com.org.ds.v1.stack;

public class StackByArray<Item> {

	private Item[] stack;
	private int numberOfItems;
	
	public StackByArray(){
		this.stack = ( Item[] ) new Object[1];
	}

	//O(1) if no resize
	public void push(Item item){
		
		if( numberOfItems == this.stack.length ){
			resize(2*this.stack.length);
		}
		
		this.stack[numberOfItems++] = item;
	}

	//O(1) if no resize
	public Item pop(){
		Item itemToPop = this.stack[--numberOfItems];
		
		if( numberOfItems > 0 && numberOfItems == this.stack.length/4 ){
			resize(this.stack.length/2);
		}
		
		return itemToPop;
	}
	
	public boolean isEmpty(){
		return this.numberOfItems == 0;
	}
	
	public int size(){
		return this.numberOfItems;
	}

	// O(n)
	private void resize(int capacity) {
		
		Item[] stackCopy = ( Item[] ) new Object[capacity];
		
		for(int i=0;i<numberOfItems;i++){
			stackCopy[i]=this.stack[i];
		}
		
		this.stack = stackCopy;
	}
}
