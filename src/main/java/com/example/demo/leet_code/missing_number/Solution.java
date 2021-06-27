package com.example.demo.leet_code.missing_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        Integer maxValue = Integer.MIN_VALUE;
        for(int num : nums){
            maxValue = Math.max(maxValue, num);
            map.put(num, true);
        }

        for (int i = 0; i <= maxValue; i++) {
            if(!map.containsKey(i)){
                return i;
            }
        }

        return maxValue + 1;
    }
}
