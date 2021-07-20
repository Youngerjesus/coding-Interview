package com.example.demo.algorithm.substring;

public class RabinKarp {
    long patHash;   // pattern hash value
    int M;          // pattern length
    long Q;         // modulus
    int R;          // radix
    long RM;        // R ^ (M - 1) % Q

    public RabinKarp(String pat) {
        M = pat.length();
        Q = longRandomPrime();
        R = 256;

        RM = 1;
        for (int i = 0; i < M; i++) {
            RM = (R * RM) % Q;
        }
        patHash = hash(pat, M);
    }

    public int serach(String txt) {
        int N = txt.length();
        long txtHash = hash(txt, M);
        if (patHash == txtHash) return 0;

        for (int i = M; i < N - M + 1; i++) {
            txtHash = (txtHash + Q - RM * txt.charAt(i - M) % Q) % Q; // txtHash 계산이 음수가 되지 않도록 하기 위해서 Q를 더한다.
            txtHash = (txtHash * R + txt.charAt(i)) % Q;
            if (patHash == txtHash) return i - M + 1;
        }

        return N;
    }

    private long longRandomPrime() {
        return 991;
    }

    private long hash(String key, int M) {
        long h = 0;
        for (int i=0; i < M; i++) {
            h = (R * h + key.charAt(i)) % Q;
        }
        return h;
    }
}
