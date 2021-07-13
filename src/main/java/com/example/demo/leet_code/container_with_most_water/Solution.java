package com.example.demo.leet_code.container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int y = j - i;
                int x = Math.min(height[i], height[j]);
                maxWater = Math.max(maxWater, x * y);
            }
        }

        return maxWater;
    }
}
