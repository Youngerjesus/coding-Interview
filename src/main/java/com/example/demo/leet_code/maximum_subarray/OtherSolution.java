package com.example.demo.leet_code.maximum_subarray;

public class OtherSolution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currentSum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum = Math.max(sum, currentSum + nums[i]);
            currentSum = Math.max(0, currentSum + nums[i]);
        }
        return sum;
    }
}
