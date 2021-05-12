package com.example.demo.leet_code.reverse_integer;

public class OtherSolution1 extends Solution {

    @Override
    public int reverse(int n) {
        int rev = 0;

        while (n != 0){
            int pop = n % 10;
            n /= 10;
            if(isOverflow(rev, pop)){
                return 0;
            }
            rev = rev * 10 + pop;
        }

        return rev;
    }

    private boolean isOverflow(int rev, int pop) {
        if(rev > (Integer.MAX_VALUE - Math.abs(pop)) / 10 ){
            return true;
        }

        return rev < (Integer.MIN_VALUE + Math.abs(pop)) / 10;
    }
}
