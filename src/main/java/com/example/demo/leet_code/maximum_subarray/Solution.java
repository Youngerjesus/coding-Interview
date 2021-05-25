package com.example.demo.leet_code.maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;

        int sum = nums[0];
        int currentSum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(currentSum + nums[i] > sum){
                sum = currentSum + nums[i];
            }
            if(currentSum + nums[i] > 0) {
                currentSum += nums[i];
            }
            else{
                currentSum = 0;
            }
        }
        return sum;
    }
}
