package com.example.demo.leet_code.intersection_of_two_linked_lists;

import java.util.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> aList = new ArrayList<>();
        List<ListNode> bList = new ArrayList<>();

        while (headA != null && headB != null) {
            aList.add(headA);
            bList.add(headB);
            headA = headA.next;
            headB = headB.next;
        }

        while (headA != null) {
            aList.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            bList.add(headB);
            headB = headB.next;
        }

        if(!isEqualLastNode(aList, bList)) return null;

        ListIterator<ListNode> aListIterator = aList.listIterator(aList.size());
        ListIterator<ListNode> bListIterator = bList.listIterator(bList.size());

        while (aListIterator.hasPrevious() && bListIterator.hasPrevious()){
            ListNode prevA = aListIterator.previous();
            ListNode prevB = bListIterator.previous();

            if(!prevA.equals(prevB)) {
                return prevA.next;
            }
        }

        return aListIterator.next();
    }

    private boolean isEqualLastNode(List<ListNode> aList, List<ListNode> bList) {
        return aList.get(aList.size() - 1).equals(bList.get(bList.size() - 1));
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
