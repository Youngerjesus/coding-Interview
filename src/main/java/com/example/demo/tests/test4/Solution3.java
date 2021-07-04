package com.example.demo.tests.test4;

public class Solution3 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxLength = 1;

        // even
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 2; j < A.length; j += 2) {
                if(A[i] == A[j]){
                    if(A[i+1] == A[j-1]) maxLength = Math.max(maxLength, j - i + 1);
                    else {
                        break;
                    }
                    if(j+1 <= A.length - 1 && A[i+1] == A[j+1]) {
                        maxLength = Math.max(maxLength, j - i + 2);
                    }else {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        return maxLength;
    }
}
