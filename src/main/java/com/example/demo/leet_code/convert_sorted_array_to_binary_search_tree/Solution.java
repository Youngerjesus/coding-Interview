package com.example.demo.leet_code.convert_sorted_array_to_binary_search_tree;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if(low > high) return null;

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums,mid + 1, high);
        return node;
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
