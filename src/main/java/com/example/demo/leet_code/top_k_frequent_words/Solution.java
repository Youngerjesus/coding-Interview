package com.example.demo.leet_code.top_k_frequent_words;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> priorityQueue =  new PriorityQueue<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length ; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            priorityQueue.add(new Pair(map.get(key), key));
        }

        List<String> list = new ArrayList<>();
        int len = priorityQueue.size();

        for (int i = 0; i < len ; i++) {
            Pair top = priorityQueue.poll();
            if(k > 0) list.add(top.s);
            k--;
        }

        return list;
    }
}

class Pair implements Comparable<Pair> {
    int frequency = 0;
    String s;

    public Pair(int frequency, String s) {
        this.frequency = frequency;
        this.s = s;
    }

    @Override
    public int compareTo(Pair pair) {
        if(frequency != pair.frequency) {
            return pair.frequency - frequency;
        }
        return s.compareTo(pair.s);
    }
}