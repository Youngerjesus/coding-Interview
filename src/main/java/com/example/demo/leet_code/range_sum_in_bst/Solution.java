package com.example.demo.leet_code.range_sum_in_bst;

public class Solution {
    boolean isSumStart = false;
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSumBSTWithInorder(root, low, high);
        return sum;
    }

    private void rangeSumBSTWithInorder(TreeNode root, int low, int high) {
        if(root == null) return;

        rangeSumBSTWithInorder(root.left, low, high);

        if(root.val == low) {
            isSumStart = true;
        }

        if(isSumStart) {
            sum += root.val;
        }

        if (root.val == high) {
            isSumStart = false;
        }

        rangeSumBSTWithInorder(root.right, low, high);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){}

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
