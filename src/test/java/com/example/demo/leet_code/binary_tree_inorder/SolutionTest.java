package com.example.demo.leet_code.binary_tree_inorder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = null;
        root.right = new Solution.TreeNode(2);
        root.right.left = new Solution.TreeNode(3);

        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(3);
        answer.add(2);
        //when
        List<Integer> output = solution.inorderTraversal(root);
        //then
        assertArrayEquals(answer.toArray(), output.toArray());
    }

    @Test
    void testCase2(){
        //given
        Solution.TreeNode root = null;
        List<Integer> answer = new ArrayList<>();
        //when
        List<Integer> output = solution.inorderTraversal(root);
        //then
        assertArrayEquals(answer.toArray(), output.toArray());
    }

    @Test
    void testCase3(){
        //given
        Solution.TreeNode root = new Solution.TreeNode(1);
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        //when
        List<Integer> output = solution.inorderTraversal(root);
        //then
        assertArrayEquals(answer.toArray(), output.toArray());
    }

    @Test
    void testCase4(){
        //given
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);

        List<Integer> answer = new ArrayList<>();
        answer.add(2);
        answer.add(1);
        //when
        List<Integer> output = solution.inorderTraversal(root);
        //then
        assertArrayEquals(answer.toArray(), output.toArray());
    }

    @Test
    void testCase5(){
        //given
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = null;
        root.right = new Solution.TreeNode(2);

        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(2);
        //when
        List<Integer> output = solution.inorderTraversal(root);
        //then
        assertArrayEquals(answer.toArray(), output.toArray());
    }
}