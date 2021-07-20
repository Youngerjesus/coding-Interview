package com.example.demo.tests.test7;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int solution(int[] A) {
        int maxValue = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.contains(A[i] * -1)) {
                maxValue = Math.max(maxValue, Math.abs(A[i]));
            }
        }

        return maxValue;
    }
}
