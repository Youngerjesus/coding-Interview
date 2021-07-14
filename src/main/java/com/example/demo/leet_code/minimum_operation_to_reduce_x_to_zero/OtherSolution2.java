package com.example.demo.leet_code.minimum_operation_to_reduce_x_to_zero;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OtherSolution2 {
    public int minOperations(int[] nums, int x) {
        Map<Integer, Integer> backwardSumMap = new HashMap<>();
        int minOperation = Integer.MAX_VALUE;

        int forwardSum = 0;
        for (int i = 0; i < nums.length; i++) {
            forwardSum += nums[i];
            if (forwardSum == x) minOperation = Math.min(minOperation, i + 1);
        }

        if(forwardSum == x) return nums.length;
        if(forwardSum < x) return -1;

        int backwardSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            backwardSum += nums[i];
            backwardSumMap.put(backwardSum, nums.length - i);
            if (backwardSum == x) minOperation = Math.min(minOperation, nums.length - i);
        }

        forwardSum = 0;
        for (int i = 0; i < nums.length; i++) {
            forwardSum += nums[i];
            if (backwardSumMap.containsKey(x - forwardSum)) {
                minOperation = Math.min(minOperation, backwardSumMap.get(x - forwardSum) + (i + 1));
            }
        }

        return minOperation == Integer.MAX_VALUE ? -1 : minOperation;
    }
}
