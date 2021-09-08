package com.example.demo.leet_code.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingNumber {
    List<List<String>> alphabetCollectors = new ArrayList<>();

    public UsingNumber(String digit) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < digit.length(); i++) {
            numbers.add(Character.getNumericValue(digit.charAt(i)));
        }

        for (int i = 0; i < numbers.size(); i++) {
            List<String> phoneAlphabets = createPossibleAlphabet(numbers.get(i));
            alphabetCollectors.add(phoneAlphabets);
        }
    }

    private List<String> createPossibleAlphabet(int n) {
        List<String> phoneAlphabets = new ArrayList<>();
        switch (n) {
            case 2:
                phoneAlphabets.add("a");
                phoneAlphabets.add("b");
                phoneAlphabets.add("c");
                break;
            case 3:
                phoneAlphabets.add("d");
                phoneAlphabets.add("e");
                phoneAlphabets.add("f");
                break;
            case 4:
                phoneAlphabets.add("g");
                phoneAlphabets.add("h");
                phoneAlphabets.add("i");
                break;
            case 5:
                phoneAlphabets.add("j");
                phoneAlphabets.add("k");
                phoneAlphabets.add("l");
                break;
            case 6:
                phoneAlphabets.add("m");
                phoneAlphabets.add("n");
                phoneAlphabets.add("o");
                break;
            case 7:
                phoneAlphabets.add("p");
                phoneAlphabets.add("q");
                phoneAlphabets.add("r");
                phoneAlphabets.add("s");
                break;
            case 8:
                phoneAlphabets.add("t");
                phoneAlphabets.add("u");
                phoneAlphabets.add("v");
                break;
            case 9:
                phoneAlphabets.add("w");
                phoneAlphabets.add("x");
                phoneAlphabets.add("y");
                phoneAlphabets.add("z");
                break;
        }

        return phoneAlphabets;
    }

    public List<String> getPossibleCombinationsOrderByDictionary() {
        List<String> result = new ArrayList<>();

        if (alphabetCollectors.isEmpty()) return result;

        createPossibleCase(result, alphabetCollectors, 0, "");
        return result;
    }

    private void createPossibleCase(List<String> result, List<List<String>> alphabetCollectors, int i, String s) {
        if (i == alphabetCollectors.size()) {
            result.add(s);
            return;
        }

        List<String> alphabets = alphabetCollectors.get(i);

        for (int j = 0; j < alphabets.size(); j++) {
            createPossibleCase(result, alphabetCollectors, i + 1, s + alphabets.get(j));
        }
    }
}
