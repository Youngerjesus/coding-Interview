package com.example.demo.leet_code.minimum_absolute_difference_in_bst;


public class Solution {
    int minValue = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        getMinimumDifferenceWithInorder(root, root.val);
        return minValue;
    }

    private int getMinimumDifferenceWithInorder(TreeNode node, int beforeValue) {
        if(node.left != null) {
            int ret = getMinimumDifferenceWithInorder(node.left, beforeValue);
            minValue = Math.min(Math.abs(node.val - ret), minValue);
        }

        minValue = Math.min(Math.abs(node.val - beforeValue), minValue);
        int ret = node.val;


        if(node.right != null) {
            ret = getMinimumDifferenceWithInorder(node.right);
            minValue = Math.min(Math.abs(ret - node.val), minValue);
        }

        return ret;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}