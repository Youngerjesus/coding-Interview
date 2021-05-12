package com.example.demo.leet_code.reverse_integer;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int reverse(int n){
        long positiveNumber = Math.abs((long) n);

        StringBuffer numberToStr = new StringBuffer(String.valueOf(positiveNumber));
        Long reverseNumber = Long.valueOf(numberToStr.reverse().toString());

        if(reverseNumber > Math.abs((long) Integer.MIN_VALUE)){
            reverseNumber = 0L;
        }

        return (int) (isNegative(n) ? reverseNumber * -1 : reverseNumber);
    }

    private boolean isNegative(int n) {
        return n < 0;
    }
}
