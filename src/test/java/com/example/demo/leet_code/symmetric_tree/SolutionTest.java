package com.example.demo.leet_code.symmetric_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    
    @Test
    void testCase1(){
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        boolean answer = true;
        //when
        boolean output = solution.isSymmetric(root);
        //then
        assertEquals(answer, output);
    }
    
    @Test
    void testCase2(){
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        boolean answer = false;
        //when
        boolean output = solution.isSymmetric(root);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase3(){
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.right = null;
        root.right.left = new TreeNode(2);
        boolean answer = false;
        //when
        boolean output = solution.isSymmetric(root);
        //then
        assertEquals(answer,output);
    }
}