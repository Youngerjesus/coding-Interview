package com.example.demo.tests.test6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static long minOperation;

    public static long minOperations(long n) {
        return minimumOneBitOperations(n, 0);
    }

    private static long minimumOneBitOperations(long n, int res) {
        if (n == 0) return res;
        int b = 1;
        while ((b << 1) <= n)
            b = b << 1;
        return minimumOneBitOperations((b >> 1) ^ b ^ n, res + b);
    }

    private static int minimumOneBitOperations(int n) {
        int sign = 1, res = 0;
        while (n > 0) {
            res += n ^ (n - 1) * sign;
            n &= n - 1;
            sign = -sign;
        }
        return Math.abs(res);
    }
}
