package com.example.demo.leet_code.fizz_buzz.processor;

public class ProcessorContainer {
    private final FizzBuzzProcessor fizzBuzzProcessor = new FizzBuzzProcessor();
    private final BuzzProcessor buzzProcessor = new BuzzProcessor();
    private final FizzProcessor fizzProcessor = new FizzProcessor();
    private final DefaultProcessor defaultProcessor = new DefaultProcessor();

    public Processor getProcessor(int n){
        if(n % 3 == 0 && n % 5 == 0){
            return fizzBuzzProcessor;
        }
        else if(n % 3 == 0){
            return fizzProcessor;
        }
        else if(n % 5 == 0){
            return buzzProcessor;
        }
        return defaultProcessor;
    }
}
