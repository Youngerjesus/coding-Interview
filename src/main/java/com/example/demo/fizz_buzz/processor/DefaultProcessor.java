package com.example.demo.fizz_buzz.processor;

import java.util.List;

public class DefaultProcessor implements Processor {
    @Override
    public void process(List<String> list, int i) {
        list.add(String.valueOf(i));
    }
}
