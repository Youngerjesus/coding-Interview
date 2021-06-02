package com.example.demo.leet_code.maximum_depth_binary_tree;

public class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepthRecursive(root, 1);
    }

    private int maxDepthRecursive(TreeNode node, int depth) {
        if(node == null) return depth - 1;
        return Math.max(maxDepthRecursive(node.left, depth + 1), maxDepthRecursive(node.right, depth + 1));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}