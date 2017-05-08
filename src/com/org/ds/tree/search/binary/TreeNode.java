package com.org.ds.tree.search.binary;

public class TreeNode {
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted = false;

	public TreeNode(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public TreeNode find(Integer data){
		if(this.data == data){
			return this;
		}
		if(data < this.data && leftChild != null){
			return leftChild.find(data);
		}
		if(rightChild != null){
			return rightChild.find(data);
		}
		return null;
	}
	
	public void insert(Integer data){
		if(data >= this.data){
			if(this.rightChild == null){
				this.rightChild = new TreeNode(data);
			}else{
				this.rightChild.insert(data);
			}
		}else{
			if(this.leftChild == null){
				this.leftChild = new TreeNode(data);
			}else{
				this.leftChild.insert(data);
			}
		}
	}
	
	public void delete(){
		this.isDeleted = true;
	}
	
	public boolean isDeleted(){
		return isDeleted;
	}
}
