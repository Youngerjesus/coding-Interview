package com.example.demo.leet_code.insert_delete_get_random;
import java.util.*;

class RandomizedSet {
    final Map<Integer, Integer> map;
    final List<Integer> list;
    final Random random;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            Integer idx = map.get(val);
            int lastIdx = list.size() - 1;
            Integer temp = list.get(lastIdx);
            list.set(lastIdx, list.get(idx));
            list.set(idx, temp);
            map.put(list.get(idx), idx);
            list.remove(lastIdx);
            map.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int idx = random.nextInt(list.size());
        return list.get(idx);
    }
}

