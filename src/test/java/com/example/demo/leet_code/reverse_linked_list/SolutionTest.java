package com.example.demo.leet_code.reverse_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void TestCase1(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //when
        ListNode reverse = solution.reverseList(head);
        //then
        while (reverse != null) {
            System.out.println(reverse.val);
            reverse = reverse.next;
        }
    }

}