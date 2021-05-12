package com.example.demo.leet_code.two_sum;

import java.util.HashMap;
import java.util.Map;

public class OtherSolution1 extends Solution{

    Map<Integer, Integer> map = new HashMap<>();

    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length ; i++) {
            int newTarget = target - nums[i];
            if(map.containsKey(newTarget) &&
                map.get(newTarget) != i){
                return new int[]{i, map.get(newTarget)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
