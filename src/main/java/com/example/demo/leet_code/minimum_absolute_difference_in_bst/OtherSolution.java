package com.example.demo.leet_code.minimum_absolute_difference_in_bst;

public class OtherSolution {
    boolean init = false;
    int minValue = Integer.MAX_VALUE;
    int prev;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minValue;
    }

    public void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);
        if(!init){
            init = true;
            prev = node.val;
        }
        else {
            minValue = Math.min(node.val - prev, minValue);
            prev = node.val;
        }

        inorder(node.right);
    }
}
