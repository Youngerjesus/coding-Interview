package com.example.demo.algorithm.substring;

public class KnuthMorrisPartt {

    String pat;
    int[][] dfa;
    int M;
    int R = 100;
    public int search(String txt) {
        int i,j;
        int N = txt.length();
        M = pat.length();

        for (i = 0, j = 0; i < N && j < M; i++) {
            j = dfa[txt.charAt(i)][j];
        }

        if (j == M) return i - M;
        else return N;
    }

    public KnuthMorrisPartt(String pat) {
        this.pat = pat;
        M = pat.length();
        dfa = new int[R][M];
        dfa[pat.charAt(0)][0] = 1;
        for (int X = 0, j = 1; j < M; j++) {
            for (int c = 0; c < R; c++) {
                dfa[c][j] = dfa[c][X]; // copy mismatch case
            }
            dfa[pat.charAt(j)][j] = j + 1; // set match case
            X = dfa[pat.charAt(j)][X]; // update restart state
        }
    }
}
