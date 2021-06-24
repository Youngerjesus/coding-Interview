package com.example.demo.leet_code.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> duplicateMap = new HashMap<>();

        for (int num : nums) {
            if(duplicateMap.containsKey(num)){
                return true;
            }
            duplicateMap.put(num, true);
        }

        return false;
    }
}
