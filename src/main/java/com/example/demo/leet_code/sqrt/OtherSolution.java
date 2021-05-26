package com.example.demo.leet_code.sqrt;

public class OtherSolution {
    public int mySqrt(int x) {
        if(x == 1) return 1;

        long top = x;
        long mid = x / 2;
        long low = 0;
        while (top > low + 1){
            if(mid * mid > x) {
                top = mid;
                mid = (low + top) / 2;
            }
            else if(mid * mid < x) {
                low = mid;
                mid = (low + top) / 2;
            } else {
                return (int) mid;
            }
        }
        return (int) mid;
    }
}
