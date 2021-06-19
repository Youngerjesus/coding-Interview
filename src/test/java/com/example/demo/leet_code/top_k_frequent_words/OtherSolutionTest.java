package com.example.demo.leet_code.top_k_frequent_words;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1() {
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        String[] answer = new String[]{"the", "is", "sunny", "day"};

        List<String> output = solution.topKFrequent(words, k);

        assertArrayEquals(answer, output.toArray());
    }

    @Test
    void testCase2(){
        String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        String[] answer = new String[]{"i", "love"};

        List<String> output = solution.topKFrequent(words, k);
        System.out.println(output);
        assertArrayEquals(answer, output.toArray());
    }

    @Test
    void testCase3(){
        String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int k = 1;
        String[] answer = new String[]{"i"};

        List<String> output = solution.topKFrequent(words, k);
        System.out.println(output);
        assertArrayEquals(answer, output.toArray());
    }
}