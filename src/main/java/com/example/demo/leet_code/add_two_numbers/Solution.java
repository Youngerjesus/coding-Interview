package com.example.demo.leet_code.add_two_numbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode root = new ListNode();
        ListNode currentRoot = root;
        int flag = 0;

        while (currentL1 != null && currentL2 != null) {
            int sum = 0;
            if(flag + currentL1.val + currentL2.val >= 10) {
                sum = (flag + currentL1.val + currentL2.val) % 10;
                flag = 1;
            }
            else {
                sum = currentL1.val + currentL2.val + flag;
                flag = 0;
            }
            currentRoot.next = new ListNode(sum);
            currentRoot = currentRoot.next;
            currentL1 = currentL1.next;
            currentL2 = currentL2.next;
        }

        ListNode notNullCurrentNode = choiceNotNullNode(currentL1, currentL2);

        while (notNullCurrentNode != null) {
            int sum = 0;
            if (flag + notNullCurrentNode.val >= 10) {
                sum = (flag + notNullCurrentNode.val) % 10;
            }
            else {
                sum = notNullCurrentNode.val + flag;
                flag = 0;
            }
            currentRoot.next = new ListNode(sum);
            currentRoot = currentRoot.next;
            notNullCurrentNode = notNullCurrentNode.next;
        }

        if (flag == 1) {
            currentRoot.next = new ListNode(flag);
        }

        return root.next;
    }

    private ListNode choiceNotNullNode(ListNode currentL1, ListNode currentL2) {
        return currentL1 == null ? currentL2 : currentL1;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode () {}

    public ListNode(int val) {
        this.val = val;
    }
}
