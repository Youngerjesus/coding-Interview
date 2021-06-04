package com.example.demo.leet_code.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return null;

        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(createFirstRow());

        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> next = createFirstRow();
            List<Integer> prev = pascal.get(i);

            for (int j = 0; j < prev.size() - 1; j++) {
                next.add(prev.get(j) + prev.get(j + 1));
            }
            next.add(1);
            pascal.add(next);
        }

        return pascal;
    }

    private List<Integer> createFirstRow() {
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        return firstRow;
    }
}
