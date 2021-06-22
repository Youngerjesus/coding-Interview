package com.example.demo.leet_code.majority_element;

import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.length ; i++) {
            if(countMap.containsKey(nums[i])){
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            }
            else{
                countMap.put(nums[i], 1);
            }
        }

        for (int key : countMap.keySet()) {
            Integer frequency = countMap.get(key);
            if(frequency >= (nums.length + 1 ) / 2) {
                priorityQueue.add(new Element(key, frequency));
            }
        }

        return priorityQueue.poll().key;
    }

    class Element implements Comparable<Element>{
        int key;
        int frequency;

        public Element(int key, int frequency) {
            this.key = key;
            this.frequency = frequency;
        }

        public void add(){
            frequency += 1;
        }

        @Override
        public int compareTo(Element o) {
            return o.frequency - frequency;
        }
    }
}
