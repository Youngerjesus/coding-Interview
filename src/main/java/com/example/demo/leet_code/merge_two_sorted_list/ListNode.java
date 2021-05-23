package com.example.demo.leet_code.merge_two_sorted_list;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public void addNextNode(ListNode listNode) {
            next = listNode;
      }
}