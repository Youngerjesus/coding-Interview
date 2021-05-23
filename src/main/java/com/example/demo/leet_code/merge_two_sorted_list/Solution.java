package com.example.demo.leet_code.merge_two_sorted_list;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (true) {
            if(l1 == null && l2 == null){
                break;
            }
            else if(l1 == null) {
                ListNode current = new ListNode(l2.val);
                tail.next = current;
                tail = tail.next;
                l2 = l2.next;
            }
            else if(l2 == null){
                ListNode current = new ListNode(l1.val);
                tail.next = current;
                tail = tail.next;
                l1 = l1.next;
            }
            else if(l1.val < l2.val){
                ListNode current = new ListNode(l1.val);
                tail.next = current;
                tail = tail.next;
                l1 = l1.next;
            }
            else {
                ListNode current = new ListNode(l2.val);
                tail.next = current;
                tail = tail.next;
                l2 = l2.next;
            }
        }

        return head.next;
    }
}
