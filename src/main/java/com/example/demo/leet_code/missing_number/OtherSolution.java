package com.example.demo.leet_code.missing_number;

public class OtherSolution {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int expectedValue = max * (max + 1) / 2 ;

        for (int i = 0; i < max; i++) {
            expectedValue -= nums[i];
        }

        return expectedValue;
    }
}
