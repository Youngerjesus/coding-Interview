package com.example.demo.tests.test7;

import java.util.Arrays;

public class Solution4 {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n;) {
            if (A[k] == B[i])
                return A[k];

            if (i < m && B[i] < A[k]){
                i += 1;
            }
            else if (B[i] > A[k]) {
                k += 1;
            }
        }
        return -1;
    }
}
