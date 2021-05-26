package com.example.demo.leet_code.sqrt;

public class Solution {
    public int mySqrt(int x) {
        if(x == 2 || x == 3) return 1;

        for (long i = 1; i <= x/2 + 1; i++) {
            if(i * i == x) return (int) i;
            if(i * i > x) return (int) (i - 1);
        }
        return x;
    }
}
