package com.example.demo.leet_code.reverse_linked_list_2;

import java.nio.channels.ShutdownChannelGroupException;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        if(left == right) return head;

        ListNode reverseHead = new ListNode(head.val);
        ListNode current = reverseHead;
        ListNode reverse = null;
        ListNode reverseEnd = null;
        boolean isReverseStart = false;
        boolean isReverseEnd = false;

        if(left == 1) {
            reverse = new ListNode(head.val);
            reverseHead = null;
            current = null;
            reverseEnd = reverse;
            isReverseStart = true;
        }

        head = head.next;
        int position = 2;

        while (head != null){
            if(position == left){
                reverse = new ListNode(head.val);
                reverseEnd = reverse;
                isReverseStart = true;
            }
            else if(isReverseStart && position == right){
                reverse = addReverseNode(reverse, head.val);
                if(current != null) current.next = reverse;
                isReverseStart = false;
                isReverseEnd = true;
            }
            else if(isReverseStart){
                reverse = addReverseNode(reverse, head.val);
            }
            else if(isReverseEnd) {
                reverseEnd = addNextNode(reverseEnd, head.val);
            }
            else {
                current = addNextNode(current, head.val);
            }
            position++;
            head = head.next;
        }

        if(current == null) reverseHead = reverse;
        return reverseHead;
    }

    private ListNode addNextNode(ListNode node, int val) {
        node.next = new ListNode(val);
        node = node.next;
        return node;
    }

    private ListNode addReverseNode(ListNode reverse, int val) {
        ListNode temp = new ListNode(val);
        temp.next = reverse;
        reverse = temp;
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
