package com.example.demo.leet_code.two_sum;

import java.util.HashMap;
import java.util.Map;

public class OtherSolution2 extends Solution {
    Map<Integer, Integer> map = new HashMap<>();

    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
