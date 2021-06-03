package com.example.demo.leet_code.convert_sorted_array_to_binary_search_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int[] input = new int[]{-10,-3,0,5,9};
        TreeNode answer = new TreeNode(0);
        answer.left = new TreeNode(-3);
        answer.left.left = new TreeNode(-10);
        answer.right = new TreeNode(9);
        answer.right.left = new TreeNode(5);
        //when
        TreeNode output = solution.sortedArrayToBST(input);
        //then
        printNode(answer);
        System.out.println(" ");
        printNode(output);
    }
    
    @Test
    void testCase2(){
        //given
        int[] input = new int[]{0,1,2,3,4,5};
        //when
        TreeNode output = solution.sortedArrayToBST(input);
        //then
        printNode(output);
    }
    
    private void printNode(TreeNode node) {
        if(node == null) {
            return;
        }

        System.out.print(node.val + " ");
        printNode(node.left);
        printNode(node.right);
    }
    
}