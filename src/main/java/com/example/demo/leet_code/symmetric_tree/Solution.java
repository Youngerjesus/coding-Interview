package com.example.demo.leet_code.symmetric_tree;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTwoSubTree(root.left, root.right);
    }

    private boolean isSymmetricTwoSubTree(TreeNode left, TreeNode right) {
        return isSymmetricTwoSubTreeRecursive(left,right);
    }

    private boolean isSymmetricTwoSubTreeRecursive(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isSymmetricTwoSubTreeRecursive(left.left, right.right) && isSymmetricTwoSubTreeRecursive(left.right, right.left);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}