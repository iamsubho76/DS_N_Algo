package com.org.ds.v3.lohia.tree;

public class BinaryTreeIsBalancedOrNot {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    
    Node root;

    // Function to check if a binary tree is balanced
    boolean isBalanced(Node root) {
        if (root == null)
            return true;

        // Check the height difference between the left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Check if the height difference is at most 1 and if both subtrees are balanced
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    // Function to calculate the height of a binary tree
    int height(Node node) {
        if (node == null)
            return 0;

        // Recursively calculate the height of the left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the maximum height of the left and right subtrees, plus 1 for the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void main(String args[]) {
        BinaryTreeIsBalancedOrNot tree = new BinaryTreeIsBalancedOrNot();

        /* Constructed balanced tree
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
