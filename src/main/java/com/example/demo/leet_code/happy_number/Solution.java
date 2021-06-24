package com.example.demo.leet_code.happy_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Boolean> cycleMap = new HashMap<>();

        while (true) {
            String numToStr = String.valueOf(n);
            int sum = 0;
            for (int i = 0; i < numToStr.length(); i++) {
                Integer number = Integer.parseInt(numToStr.substring(i,i+1));
                sum += Math.pow(number, 2);
            }
            if(sum == 1) return true;
            if(cycleMap.containsKey(sum)) return false;
            cycleMap.put(sum, true);
            n = sum;
        }
    }
}
