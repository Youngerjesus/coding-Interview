package com.example.demo.leet_code.reverse_linked_list;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode reverse = null;
        while (head != null) {
            ListNode temp = reverse;
            reverse = new ListNode(head.val);
            reverse.next = temp;
            head = head.next;
        }

        return reverse;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

