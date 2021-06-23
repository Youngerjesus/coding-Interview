package com.example.demo.leet_code.reverse_linked_list_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int left = 2;
        int right = 4;
        //when
        ListNode output = solution.reverseBetween(head, left, right);
        //then
        while (output != null){
            System.out.println(output.val);
            output = output.next;
        }
    }

    @Test
    void testCase2(){
        //given
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        int left = 1;
        int right = 2;
        //when
        ListNode output = solution.reverseBetween(head, left, right);
        //then
        while (output != null){
            System.out.println(output.val);
            output = output.next;
        }
    }

    @Test
    void testCase3(){
        //given
        ListNode head = new ListNode(5);
        int left = 1;
        int right = 1;
        //when
        ListNode output = solution.reverseBetween(head, left, right);
        //then
        while (output != null){
            System.out.println(output.val);
            output = output.next;
        }
    }

    @Test
    void testCase4(){
        //given
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        int left = 1;
        int right = 1;
        //when
        ListNode output = solution.reverseBetween(head, left, right);
        //then
        while (output != null){
            System.out.println(output.val);
            output = output.next;
        }
    }

}