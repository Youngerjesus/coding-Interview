package com.example.demo.leet_code.minimum_absolute_difference_in_bst;


public class Solution {
    int minValue = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        getMinimumDifferenceWithInorder(root, root.val);
        return minValue;
    }

    private int getMinimumDifferenceWithInorder(TreeNode node, int beforeValue) {
        if(node.left != null) {
            int leftValue = getMinimumDifferenceWithInorder(node.left, beforeValue);
            minValue = Math.min(Math.abs(node.val - leftValue), minValue);
            if(node.left.right != null) {
                int rightValue = getMinimumDifferenceWithInorder(node.left, node.val);
                minValue = Math.min(Math.abs(node.val - rightValue), minValue);
            }
        }

        int ret = node.val;
        if(node.val != beforeValue) minValue = Math.min(Math.abs(node.val - beforeValue), minValue);

        if(node.right != null) {
            int rightValue = getMinimumDifferenceWithInorder(node.right, beforeValue);
            minValue = Math.min(Math.abs(node.val - rightValue), minValue);

            if(node.right.left != null) {
                int leftValue = getMinimumDifferenceWithInorder(node.right, node.val);
                minValue = Math.min(Math.abs(node.val - leftValue), minValue);
            }
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