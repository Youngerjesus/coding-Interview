package com.example.demo.leet_code.palindrome_linked_list;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        List<Integer> halfList = new ArrayList<>();

        while (fast != null) {
            if(fast.next == null) {
                slow = slow.next;
                break;
            }
            else fast = fast.next.next;
            halfList.add(slow.val);
            slow = slow.next;
        }

        int halfLen = halfList.size();
        while (slow != null){
            if(halfList.get(halfLen - 1) != slow.val) return false;
            slow = slow.next;
            halfLen--;
        }

        return true;
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
