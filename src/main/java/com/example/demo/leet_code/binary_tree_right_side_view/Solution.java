package com.example.demo.leet_code.binary_tree_right_side_view;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> rightView = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                if(i == 0) {
                    rightView.add(node.val);
                }
                if (node.right != null) deque.addLast(node.right);
                if (node.left != null) deque.addLast(node.left);
            }
        }

        return rightView;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
