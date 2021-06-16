package com.example.demo.leet_code.intersection_of_two_linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;
        //when
        ListNode output = solution.getIntersectionNode(headA, headB);
        //then
        assertEquals(8, output.val);
    }

    @Test
    void testCase2(){
        //given
        ListNode headA = new ListNode(1);
        ListNode headB = headA;
        //when
        ListNode output = solution.getIntersectionNode(headA, headB);
        //then
        assertEquals(1, output.val);
    }

    @Test
    void testCase3(){
        //given
        ListNode headA = new ListNode(3);
        ListNode headB = new ListNode(2);
        headB.next = headA;
        //when
        ListNode output = solution.getIntersectionNode(headA, headB);
        //then
        assertEquals(3, output.val);
    }
}