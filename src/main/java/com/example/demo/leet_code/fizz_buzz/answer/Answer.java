package com.example.demo.leet_code.fizz_buzz.answer;

import com.example.demo.leet_code.fizz_buzz.processor.Processor;
import com.example.demo.leet_code.fizz_buzz.processor.ProcessorContainer;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    ProcessorContainer manager;
    List<String> answer;
    Processor processor;

    public Answer() {
        answer = new ArrayList<>();
        manager = new ProcessorContainer();
    }

    public void process(int n){
        for (int i = 1; i <= n; i++) {
            processor = manager.getProcessor(i);
            processor.process(answer, i);
        }
    }

    public List<String> get() {
        return answer;
    }
}
