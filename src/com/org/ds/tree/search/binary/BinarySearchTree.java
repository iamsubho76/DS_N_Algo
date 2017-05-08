package com.org.ds.tree.search.binary;

public class BinarySearchTree {
	private TreeNode root;

	public void insert(Integer data) {
		if (root == null) {
			this.root = new TreeNode(data);
		} else {
			root.insert(data);
		}
	}

	public TreeNode find(Integer data) {
		if (root != null) {
			return root.find(data);
		}
		return null;
	}

	public void delete(Integer data) {
		TreeNode currentNode = this.root;
		TreeNode parent = this.root;
		boolean isLeftchild = false;
		
		if(currentNode == null){
			return;
		}
		
		while(currentNode != null && currentNode.getData() != data){
			parent = currentNode;
			
			if(data < currentNode.getData()){
				currentNode = currentNode.getLeftChild();
				isLeftchild = true;
			}else{
				currentNode = currentNode.getRightChild();
				isLeftchild = false;
			}
			
		}
		
		if(currentNode == null){
			return;
		}
		
		if(currentNode.getLeftChild() == null && currentNode.getRightChild() == null){
			if(currentNode == root){
				root = null;
			}else{
				if(isLeftchild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		}else if(currentNode.getRightChild() == null){
			if(currentNode == root){
				root =  currentNode.getLeftChild();
			}else if(isLeftchild){
				parent.setLeftChild(currentNode.getLeftChild());
			}else{
				parent.setRightChild(currentNode.getLeftChild());
			}
		}else if(currentNode.getLeftChild() == null){
			if(currentNode == root){
				root =  currentNode.getRightChild();
			}else if(isLeftchild){
				parent.setLeftChild(currentNode.getRightChild());
			}else{
				parent.setRightChild(currentNode.getRightChild());
			}
		}
	}
}
