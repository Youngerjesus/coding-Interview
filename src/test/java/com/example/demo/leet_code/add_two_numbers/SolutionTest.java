package com.example.demo.leet_code.add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(1);
        //when
        ListNode expected = solution.addTwoNumbers(l1, l2);
        //then
        while (expected != null){
            System.out.println(expected.val);
            expected = expected.next;
        }
    }

    @Test
    void testCase2(){
        //given
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
        //when
        ListNode expected = solution.addTwoNumbers(l1, l2);
        //then
        while (expected != null){
            System.out.println(expected.val);
            expected = expected.next;
        }
    }
}