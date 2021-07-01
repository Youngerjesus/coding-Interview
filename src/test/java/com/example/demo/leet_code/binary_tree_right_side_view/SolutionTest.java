package com.example.demo.leet_code.binary_tree_right_side_view;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        int[] answer = new int[]{1,3,4};
        //when
        List<Integer> output = solution.rightSideView(root);
        //then
        int[] outputArray = output.stream()
                .mapToInt(i -> i)
                .toArray();

        assertArrayEquals(answer, outputArray);
    }

}