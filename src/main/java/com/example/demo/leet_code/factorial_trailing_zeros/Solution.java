package com.example.demo.leet_code.factorial_trailing_zeros;

public class Solution {
    int fiveCount = 0;

    public int trailingZeroes(int n) {
        calculateTwoAndFiveCount(n);
        return fiveCount;
    }

    private void calculateTwoAndFiveCount(int n) {
        for (int i = 2; i <= n; i++) {
            int num = i;
            while (num % 5 == 0){
                fiveCount += 1;
                num = num / 5;
            }
        }
    }
}
