package com.example.demo.leet_code.count_prime;

public class OtherSolution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int primeCount = 0;

        for (int i = 2; i < n; i++) {
            if(!notPrime[i]){
                primeCount++;

                for (int j = 1; j * i < n; j++) {
                    notPrime[j * i] = true;
                }
            }
        }

        return primeCount;
    }
}
