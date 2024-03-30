package com.org.ds.v1.tree.red_black_tree;

public interface Tree {
    public Node getMax();
    public Node getMin();
    public void insert(int data);
    public void remove(int value);
    public void traverseGraph();
}
