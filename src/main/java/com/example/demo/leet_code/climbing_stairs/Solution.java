package com.example.demo.leet_code.climbing_stairs;


public class Solution {
    private int[] cache = new int[46];

    public int climbStairs(int n) {
        initialize(cache);
        return climbStairsRecursive(n);
    }

    private void initialize(int[] cache) {
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
    }

    private int climbStairsRecursive(int n) {
        if(n < 0) return 0;

        if(n == 0) return 1;

        if(cache[n] != -1) return cache[n];

        return cache[n] = climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

}
