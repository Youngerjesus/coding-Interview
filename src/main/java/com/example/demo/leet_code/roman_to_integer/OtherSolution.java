package com.example.demo.leet_code.roman_to_integer;

public class OtherSolution extends Solution{

    public OtherSolution() {
        super();
    }

    @Override
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        while (i < s.length()){
            char currentSymbol = s.charAt(i);
            Integer currentValue = romanMap.get(currentSymbol);
            Integer nextValue = 0;

            if(i + 1 < s.length()){
                char nextSymbol = s.charAt(i+1);
                nextValue = romanMap.get(nextSymbol);
            }

            if(currentValue < nextValue) {
                sum += nextValue - currentValue;
                i += 2;
            }

            else {
                sum += currentValue;
                i += 1;
            }
        }

        return sum;
    }
}
