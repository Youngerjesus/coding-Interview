package com.example.demo.tests.test6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution_1 {
    public static List<Integer> cardinalitySort(List<Integer> nums) {
        // Write your code here
        PriorityQueue<BinaryCardinality> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.size(); i++) {
            String binaryString = Integer.toBinaryString(nums.get(i));
            int cardinality = 0;
            for (int j = 0; j < binaryString.length(); j++) {
                if (binaryString.charAt(j) == '1') {
                    cardinality++;
                }
            }
            priorityQueue.add(new BinaryCardinality(i, nums.get(i), cardinality));
        }

        List<Integer> result = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            BinaryCardinality cardinality = priorityQueue.poll();
            result.add(nums.get(cardinality.index));
        }

        return result;
    }

    static class BinaryCardinality implements Comparable<BinaryCardinality> {
        int index;
        int val;
        int cardinality;

        public BinaryCardinality(int index, int val, int cardinality) {
            this.index = index;
            this.val = val;
            this.cardinality = cardinality;
        }

        @Override
        public int compareTo(BinaryCardinality b) {
            if (b.cardinality == this.cardinality) {
                return val - b.val; // index 가 작은쪽이 왼쪽으로
            }

            return cardinality - b.cardinality; // cardinality 가 작은쪽이 왼쪽으로.
        }
    }
}
