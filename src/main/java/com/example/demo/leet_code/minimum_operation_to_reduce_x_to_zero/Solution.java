package com.example.demo.leet_code.minimum_operation_to_reduce_x_to_zero;

public class Solution {
    int minOperation = Integer.MAX_VALUE;
    int[][] cache;
    public int minOperations(int[] nums, int x) {
        int i = 0;
        int j = nums.length - 1;
        cache = new int[nums.length + 1][nums.length + 1];
        return minOperations(nums, x, i, j, 0);
    }

    private int minOperations(int[] nums, int x, int i, int j, int minOperation) {
        minOperationRecursion(nums, x, i, j, minOperation);
        return this.minOperation == Integer.MAX_VALUE ? -1 : this.minOperation;
    }

    private void minOperationRecursion(int[] nums, int x, int i, int j, int minOperation) {
        if (i > j) {
            return;
        }

        if (x - nums[i] == 0 || x - nums[j] == 0){
            this.minOperation = Math.min(this.minOperation, minOperation + 1);
            cache[i][j] = this.minOperation;
            return;
        }

        if((nums[i] > x && nums[j] > x) || cache[i][j] != 0) {
            return;
        }

        if(nums[i] < x) {
            minOperationRecursion(nums, x - nums[i], i + 1, j, minOperation + 1);
        }

        if(nums[j] < x) {
            minOperationRecursion(nums, x - nums[j], i, j - 1, minOperation + 1);
        }
    }
}
