package com.example.demo.fizz_buzz;

import com.example.demo.fizz_buzz.answer.Answer;

import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n){
        Answer answer = new Answer();
        answer.process(n);
        return answer.get();
    }
}

