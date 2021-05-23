package com.example.demo.leet_code.merge_two_sorted_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {
    Solution solution = new OtherSolution();

    @Test
    void testCase1(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode answer = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode output = solution.mergeTwoLists(l1, l2);
        while (answer != null && output != null){
            assertEquals(answer.val, output.val);
            answer = answer.next;
            output = output.next;
        }
        assertEquals(answer, null);
        assertEquals(output, null);
    }

    @Test
    void testCase2(){
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode answer = null;
        ListNode output = solution.mergeTwoLists(l1, l2);
        while (answer != null && output != null){
            assertEquals(answer.val, output.val);
            answer = answer.next;
            output = output.next;
        }
        assertEquals(answer, null);
        assertEquals(output, null);
    }

    @Test
    void testCase3(){
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode answer = new ListNode(0);
        ListNode output = solution.mergeTwoLists(l1, l2);
        while (answer != null && output != null){
            assertEquals(answer.val, output.val);
            answer = answer.next;
            output = output.next;
        }
        assertEquals(answer, null);
        assertEquals(output, null);
    }

    @Test
    void testCase4(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        ListNode answer = new ListNode(1);
        ListNode output = solution.mergeTwoLists(l1, l2);
        while (answer != null && output != null){
            assertEquals(answer.val, output.val);
            answer = answer.next;
            output = output.next;
        }
        assertEquals(answer, null);
        assertEquals(output, null);
    }

}