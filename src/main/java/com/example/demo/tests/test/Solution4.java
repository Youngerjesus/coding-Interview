package com.example.demo.tests.test;

import java.util.*;

public class Solution4 {
    public int[] solution(int n, int[][] queries) {

        NStack nStack = new NStack(n);
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];

            if(b != -1){
                nStack.push(a,b);
            }else {
                int pop = nStack.pop(a);
                answerList.add(pop);
            }
        }

        int[] answer = answerList.stream()
                .mapToInt(val -> val)
                .toArray();

        return answer;
    }
}

class NStack {
    List<Deque<Integer>> nStack;
    
    public NStack(int size) {
        nStack = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            nStack.add(new ArrayDeque<>());
        }
    } 
    
    public void push(int a, int b){
        boolean allStackIsEmpty = nStack.stream().allMatch(Collection::isEmpty);

        if(allStackIsEmpty){
            for (int i = 0; i < nStack.size(); i++) {
                Deque<Integer> stack = nStack.get(i);
                stack.addLast(b);
            }
            return;
        }

        Deque<Integer> stack = nStack.get(a - 1);
        stack.addLast(b);
    }

    public int pop(int a){
        boolean allStackIsEmpty = nStack.stream().allMatch(Collection::isEmpty);
        if(allStackIsEmpty) return -1;

        Deque<Integer> currentStack = nStack.get(a - 1);
        if(currentStack.size() >= 2) {
            return currentStack.removeLast();
        }

        // empty
        int pop = 0;
        for (int i = 0; i < nStack.size() ; i++) {
            Deque<Integer> deque = nStack.get(i);
            pop = deque.removeFirst();
        }

        for (int i = a; i < nStack.size(); i++) {
            Deque<Integer> deque = nStack.get(i);
            if(deque.size() >= 1) {
                Integer center = deque.getFirst();
                for (int j = 0; j < nStack.size() ; j++) {
                    if(i == j) continue;
                    Deque<Integer> deque1 = nStack.get(j);
                    deque1.addFirst(center);
                }
                return pop;
            }
        }

        for (int i = 0; i < a - 1; i++) {
            Deque<Integer> deque = nStack.get(i);

            if(deque.size() >= 1) {
                Integer center = deque.getFirst();
                for (int j = 0; j < nStack.size() ; j++) {
                    if(i == j) continue;
                    Deque<Integer> deque1 = nStack.get(j);
                    deque1.addFirst(center);
                }
                return pop;
            }
        }
        return pop;
    }
}
