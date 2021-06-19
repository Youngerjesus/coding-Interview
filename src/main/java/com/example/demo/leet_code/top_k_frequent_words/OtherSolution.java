package com.example.demo.leet_code.top_k_frequent_words;

import java.util.*;

public class OtherSolution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, WordCount> map = new HashMap<>();

        for(String word : words) {
            if(map.containsKey(word)){
                WordCount wc = map.get(word);
                wc.cnt += 1;
                map.put(word, wc);
            }
            else {
                map.put(word, new WordCount(word));
            }
        }

        Comparator<WordCount> minHeapComparator = (wc1, wc2) -> {
            if(wc1.cnt != wc2.cnt) {
                return wc1.cnt - wc2.cnt;
            }
            return wc2.word.compareTo(wc1.word);
        };

        PriorityQueue<WordCount> pq = new PriorityQueue<>(k, minHeapComparator);

        for (WordCount wc : map.values()) {
            pq.add(wc);
            if(pq.size() > k) {
                pq.poll();
            }
        }

        List<String> ret = new ArrayList<>();

        while (!pq.isEmpty()){
            ret.add(0,pq.poll().word);
        }

        return ret;
    }

    public class WordCount {
        int cnt;
        String word;

        public WordCount(String word) {
            this.word = word;
            cnt = 1;
        }
    }
}
