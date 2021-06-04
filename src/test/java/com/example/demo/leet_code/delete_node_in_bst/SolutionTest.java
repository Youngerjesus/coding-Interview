package com.example.demo.leet_code.delete_node_in_bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int key = 3;
        int[] answer = new int[]{5,3,6,2,4,0,7};
        //when
        TreeNode output = solution.deleteNode(root, key);
        //then
        printPreOrder(output);
    }

    @Test
    void testCase2(){
        //given
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        int key = 5;
        //when
        TreeNode output = solution.deleteNode(root, key);
        //then
        System.out.println(output);
    }

    @Test
    void testCase3(){
        //given
        TreeNode root = new TreeNode(0);
        int key = 0;
        //when
        TreeNode output = solution.deleteNode(root, key);
        //then
        System.out.println(output);
    }

    @Test
    void testCase4(){
        //given
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        int key = 50;
        //when
        TreeNode output = solution.deleteNode(root, key);
        //then
        System.out.println(output);
    }
    
    @Test
    void testCase5(){
        //given
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        int key = 2;
        //when
        TreeNode output = solution.deleteNode(root, key);
        //then
        System.out.println(output);
    }
    private void printPreOrder(TreeNode output) {
        if(output == null) return;
        System.out.print(output.val + " ");
        printPreOrder(output.left);
        printPreOrder(output.right);
    }
}