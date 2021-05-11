package com.example.demo.fizz_buzz.processor;

import java.util.List;

public class FizzProcessor implements Processor {
    @Override
    public void process(List<String> list, int i) {
        list.add("Fizz");
    }
}
