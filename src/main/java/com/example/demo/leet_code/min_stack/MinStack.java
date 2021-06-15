package com.example.demo.leet_code.min_stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MinStack {
    int minVal = Integer.MAX_VALUE;
    Deque<Integer> stack = new ArrayDeque<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        if(val < minVal) minVal = val;
        stack.addLast(val);
    }

    public void pop() {
        if(stack.getLast() == minVal) {
            findNextMinVal();
        }
        stack.removeLast();
    }

    private void findNextMinVal() {
        Iterator<Integer> iter = stack.descendingIterator();
        iter.next();

        int minVal = Integer.MAX_VALUE;
        while (iter.hasNext()){
            Integer val = iter.next();
            if(minVal > val) minVal = val;
        }
        this.minVal = minVal;
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minVal;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
