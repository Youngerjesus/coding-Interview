package com.example.demo.leet_code.binary_tree_inodrer;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> answer = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTraversalRecursion(root);
        return answer;
    }

    private void inorderTraversalRecursion(TreeNode node) {
        if(node == null) return;
        inorderTraversalRecursion(node.left);
        answer.add(node.val);
        inorderTraversalRecursion(node.right);
    }

    static class TreeNode {
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
}