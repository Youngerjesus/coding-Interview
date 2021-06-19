package com.example.demo.leet_code.maximum_depth_binary_tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class OtherSolution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Deque<TreeNode> queue = new ArrayDeque<>();
        int depth = 0;
        queue.offer(root);

        while (!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return depth;
    }

}