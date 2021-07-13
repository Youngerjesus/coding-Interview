package com.example.demo.leet_code.container_with_most_water;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OtherSolution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftBar = 0;
        int rightBar = 0;
        int candidateBar = 0;
        HashList<Integer> candidateList = new HashList<>();

        while (rightBar < height.length) {
            if(height[rightBar] > height[candidateBar]) {
                candidateBar = rightBar;
                candidateList.add(rightBar);
            }

            int leftBarArea = Math.min(height[leftBar], height[rightBar]) * (rightBar - leftBar);
            int deleteIndex = -1;
            for (int i = 0; i < candidateList.size(); i++) {
                int candidateBarArea = Math.min(height[candidateList.get(i)], height[rightBar]) * (rightBar - candidateList.get(i));
                if(candidateBarArea > leftBarArea) {
                    leftBar = candidateList.get(i);
                    leftBarArea = candidateBarArea;
                    deleteIndex = i;
                }
            }

            if(deleteIndex > 0) {
                for (int i = 0; i < deleteIndex; i++) {
                    candidateList.remove(0);
                }
            }

            maxArea = Math.max(maxArea, leftBarArea);
            rightBar++;
        }

        return maxArea;
    }

    static class HashList <T> {
        List<T> list = new ArrayList<>();
        Map<T, Integer> map = new HashMap<>();

        public void add(T val) {
            if(map.containsKey(val)) {
                return;
            }

            list.add(val);
            map.put(val, list.size() - 1);
        }

        public T get(int index){
            return list.get(index);
        }

        public void remove(T val){
            if(!map.containsKey(val)){
                return;
            }

            Integer index = map.get(val);
            map.remove(val);
            T remove = list.get(index);
            T swap = list.get(list.size() - 1);
            list.set(index, swap);
            list.set(list.size() - 1, remove);
            map.put(swap, index);
            list.remove(list.size() - 1);
        }

        public int size() {
            return list.size();
        }
    }
}
