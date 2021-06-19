package com.example.demo.leet_code.minimum_absolute_difference_in_bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1(){
        //given
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int answer = 1;
        //when
        int output = solution.getMinimumDifference(root);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(48);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(49);
        int answer = 1;
        //when
        int output = solution.getMinimumDifference(root);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        TreeNode root = new TreeNode(236);
        root.left = new TreeNode(104);
        root.right = new TreeNode(701);
        root.left.right = new TreeNode(227);
        root.right.right = new TreeNode(911);
        int answer = 9;
        //when
        int output = solution.getMinimumDifference(root);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase4(){
        //given
        TreeNode root = new TreeNode(600);
        root.left = new TreeNode(424);
        root.right = new TreeNode(612);
        root.left.right = new TreeNode(499);
        root.right.right = new TreeNode(689);
        int answer = 12;
        //when
        int output = solution.getMinimumDifference(root);
        //then
        assertEquals(answer, output);
    }
}