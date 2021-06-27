package com.example.demo.leet_code.delete_node_in_a_linked_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    @DisplayName("Head 가 2개 일 경우에는 두번째 리턴한다.")
    void testCase1(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        //when
        solution.deleteNode(head);
        //then
        assertEquals(head.val, 2);
    }

    @Test
    @DisplayName("Head 가 삭제될 경우에는 다음 번 부터 리턴된다.")
    void testCase2(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        //when
        solution.deleteNode(head);
        //then
        assertEquals(head.val, 2);
    }

    @Test
    @DisplayName("중간요소가 삭제될 경우")
    void testCase3(){
        //given
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        //when
        solution.deleteNode(head.next);
        //then
        assertEquals(head.val, 1);
        assertEquals(head.next.val, 3);

    }
}