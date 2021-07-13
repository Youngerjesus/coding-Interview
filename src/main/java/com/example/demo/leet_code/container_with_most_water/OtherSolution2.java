package com.example.demo.leet_code.container_with_most_water;

public class OtherSolution2 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, area);
            if(height[i] > height[j]) {
                j--;
            }
            else {
                i++;
            }
        }

        return maxArea;
    }
}
