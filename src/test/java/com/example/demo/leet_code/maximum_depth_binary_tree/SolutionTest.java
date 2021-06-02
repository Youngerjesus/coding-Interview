package com.example.demo.leet_code.maximum_depth_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int answer = 3;
        //when
        int output = solution.maxDepth(root);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        int answer = 2;
        //when
        int output = solution.maxDepth(root);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        TreeNode root = null;
        int answer = 0;
        //when
        int output = solution.maxDepth(root);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase4(){
        //given
        TreeNode root = new TreeNode(0);
        int answer = 1;
        //when
        int output = solution.maxDepth(root);
        //then
        assertEquals(answer, output);
    }

}