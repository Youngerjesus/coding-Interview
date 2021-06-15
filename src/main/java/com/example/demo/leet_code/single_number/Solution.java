package com.example.demo.leet_code.single_number;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numberStore = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            numberStore.put(nums[i], numberStore.getOrDefault(nums[i], 0) + 1);
        }

        Iterator<Integer> iter = numberStore.keySet().iterator();
        while (iter.hasNext()){
            Integer key = iter.next();
            Integer num = numberStore.get(key);
            if(num == 1) return key;
        }

        throw new RuntimeException();
    }
}
