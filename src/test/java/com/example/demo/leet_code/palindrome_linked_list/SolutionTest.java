package com.example.demo.leet_code.palindrome_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        //when
        boolean output = solution.isPalindrome(head);
        //then
        assertTrue(output);
    }

    @Test
    void testCase2(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        //when
        boolean output = solution.isPalindrome(head);
        //then
        assertFalse(output);
    }
}