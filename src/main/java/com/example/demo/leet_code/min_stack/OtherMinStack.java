package com.example.demo.leet_code.min_stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class OtherMinStack {
    Deque<Node> stack = new ArrayDeque<>();

    public void push(int val) {
        if(stack.isEmpty()){
            stack.addLast(new Node(val, val));
            return;
        }
        stack.addLast(new Node(val, Math.min(val, stack.getLast().min)));
    }

    public void pop() {
        stack.removeLast();
    }

    public int top() {
        return stack.getLast().val;
    }

    public int getMin() {
        return stack.getLast().min;
    }

    class Node {
        int val;
        int min;

        Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
}
