package com.example.demo.leet_code.linked_list_cycle;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Boolean> isVisited = new HashMap<>();

        while (head.next != null) {
            if(isVisited.containsKey(head)){
                return true;
            }

            isVisited.put(head, true);
            head = head.next;
        }

        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
