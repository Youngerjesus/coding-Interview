package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int solution(String inputString) {
        int answer = 0;
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if(i >= 100) list.add(new Pair(i/100, i));
            if(i >= 10) list.add(new Pair(i/10, i));
            list.add(new Pair(i%10, i));
        }

        int len = inputString.length();

        for (int i = 0; i < len; i++) {
            if(inputString.charAt(i) - '0' != list.get(answer).first) i--;
            answer++;
        }
        return list.get(answer - 1).second;
    }
}

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

