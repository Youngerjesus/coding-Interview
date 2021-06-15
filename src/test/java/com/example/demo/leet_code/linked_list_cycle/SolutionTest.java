package com.example.demo.leet_code.linked_list_cycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        //when
        boolean output = solution.hasCycle(head);
        //then
        assertTrue(output);
    }

    @Test
    void testCase2(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        //when
        boolean output = solution.hasCycle(head);
        //then
        assertTrue(output);
    }

    @Test
    void testCase3(){
        //given
        ListNode head = new ListNode(1);
        //when
        boolean output = solution.hasCycle(head);
        //then
        assertFalse(output);
    }
}