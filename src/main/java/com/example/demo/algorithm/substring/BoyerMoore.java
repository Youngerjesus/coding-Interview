package com.example.demo.algorithm.substring;

public class BoyerMoore {
    int[] right;
    int R;
    String pat;

    public BoyerMoore(String pat) {
        this.pat = pat;
        int R = 100;
        right = new int[R];

        for (int i = 0; i < R; i++) {
            right[i] = -1;
        }

        for (int i = 0; i < pat.length() ; i++) {
            right[pat.charAt(i)] = i;
        }
    }
    
    public int search(String txt) {
        int N = txt.length();
        int M = pat.length();
        int skip;

        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) return i;
        }

        return N;
    }
}
