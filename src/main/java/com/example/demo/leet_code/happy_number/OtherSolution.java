package com.example.demo.leet_code.happy_number;

public class OtherSolution {
    public boolean isHappy(int n) {
        int slow;
        int fast;

        slow = fast = n;

        while (true){
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if(fast == 1) return true;
            if(slow == fast) return false;
        }
    }

    public int digitSquareSum(int n){
        int sum = 0;
        while (n > 0){
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}
