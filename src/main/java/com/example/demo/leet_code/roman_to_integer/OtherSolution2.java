package com.example.demo.leet_code.roman_to_integer;

public class OtherSolution2 extends Solution {
    public OtherSolution2() {
        super();
    }

    @Override
    public int romanToInt(String s) {
        char lastSymbol = s.charAt(s.length() - 1);
        Integer lastValue = romanMap.get(lastSymbol);
        int sum = lastValue;

        for (int i = s.length() - 2; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            Integer currentValue = romanMap.get(currentSymbol);
            if(currentValue >= lastValue) {
                sum += currentValue;
            }
            else {
                sum -= currentValue;
            }
            lastValue = currentValue;
        }

        return sum;
    }
}
