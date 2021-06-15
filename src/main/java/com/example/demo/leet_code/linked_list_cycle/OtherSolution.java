package com.example.demo.leet_code.linked_list_cycle;

import java.util.HashMap;
import java.util.Map;

public class OtherSolution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if(fast.next == null || fast.next.next == null) return false;

            if(fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
