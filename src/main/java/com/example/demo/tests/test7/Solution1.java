package com.example.demo.tests.test7;

import java.util.Arrays;

public class Solution1 {
    public String solution(int U, int L, int[] C) {
        int[][] board = new int[2][C.length];
        final String IMPOSSIBLE = "IMPOSSIBLE";
        int numOne = 0;

        for (int i = 0; i < C.length; i++) {
            if (C[i] == 2) {
                board[0][i] = 1;
                board[1][i] = 1;
                U--;
                L--;
            }
            else if (C[i] == 1) numOne++;

            if (U < 0 || L < 0) {
                return IMPOSSIBLE;
            }
        }

        if (numOne != U + L) return IMPOSSIBLE;

        for (int i = 0; i < C.length; i++) {
            if (C[i] == 1) {
                if (U == 0 && L == 0) return IMPOSSIBLE;

                if (U > 0) {
                    board[0][i] = 1;
                    U--;
                }
                else if (L > 0) {
                    board[1][i] = 1;
                    L--;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .forEach(result::append);
        result.insert(C.length, ",");

        return result.toString();
    }
}
