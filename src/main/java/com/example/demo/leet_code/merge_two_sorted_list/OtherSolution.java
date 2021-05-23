package com.example.demo.leet_code.merge_two_sorted_list;

public class OtherSolution extends Solution{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null && l2 != null ) {
            if(l2.val < l1.val) {
                tail.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            else if(l1.val <= l2.val){
                tail.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            tail = tail.next;
        }

        tail.next = l1 == null ? l2 : l1;

        return head.next;
    }
}
