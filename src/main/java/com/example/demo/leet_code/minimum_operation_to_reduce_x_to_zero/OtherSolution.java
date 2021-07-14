package com.example.demo.leet_code.minimum_operation_to_reduce_x_to_zero;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OtherSolution {
    public int minOperations(int[] nums, int x) {
        int[] forwardSum = new int[nums.length + 1];
        int[] backwardSum = new int[nums.length + 1];

        forwardSum[0] = 0;
        int cachePosition = -1;
        for (int i = 1; i <= nums.length ; i++) {
            forwardSum[i] += forwardSum[i - 1] + nums[i - 1];
            if (forwardSum[i] >= x && cachePosition == -1) {
                cachePosition = i;
            }
        }

        if (cachePosition == nums.length) return cachePosition;
        if (cachePosition == -1) return -1;

        backwardSum[0] = 0;
        for (int i = nums.length; i > 0 ; i--) {
            int j = nums.length + 1 - i;
            backwardSum[j] = backwardSum[j - 1] + nums[i - 1];
        }

        int minOperation = Integer.MAX_VALUE;
        for (int i = cachePosition; i >= 0; i--) {
            for (int j = 0; j < nums.length; j++) {
                if(forwardSum[i] + backwardSum[j] > x) {
                    break;
                }

                if (forwardSum[i] + backwardSum[j] == x){
                    minOperation = Math.min(minOperation, i + j);
                }
            }
        }

        return minOperation == Integer.MAX_VALUE ? -1 : minOperation;
    }
}
