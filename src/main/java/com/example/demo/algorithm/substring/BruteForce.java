package com.example.demo.algorithm.substring;

public class BruteForce {

    int search(String text, String pattern) {
        int i = 0;
        int j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                boolean isFind = true;
                for (int k = 0; k < pattern.length(); k++) {
                    if (text.charAt(i + k) != pattern.charAt(j + k)) {
                        isFind = false;
                        break;
                    }
                }

                if (isFind) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    int search2 (String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        for (int i = 0; i <= M - N; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) break;
            }

            if (j == M) return i;
        }

        return N;
    }

    int search3(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int i;
        int j;
        for (i = 0, j = 0; i < N && j < M; i++) {
            if (txt.charAt(i) == pat.charAt(j)) j++;
            else {
                i -= j;
                j = 0;
            }
        }
        if (j == M) return i - M;
        else return N;
    }
}
