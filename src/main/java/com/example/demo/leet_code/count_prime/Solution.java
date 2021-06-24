package com.example.demo.leet_code.count_prime;

import java.util.List;

public class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        int i = 3;
        int primeCount = 1;
        while (i < n) {
            boolean isPrimeNumber = true;
            for (int j = 3; j <= Math.sqrt(i); j+=2) {
                if(i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber) primeCount++;
            i+=2;
        }

        return primeCount;
    }
}
