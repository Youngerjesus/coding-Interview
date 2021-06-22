package com.example.demo.leet_code.excel_sheet_column_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> columnMap = new HashMap<>();
        int columnMappingCount = 1;

        for (char c = 'A'; c <= 'Z'; c++){
            columnMap.put(c,columnMappingCount++);
        }

        int columnNumber = 0;
        StringBuilder reverseColumnTitle = new StringBuilder(columnTitle).reverse();
        for (int i = 0; i < reverseColumnTitle.length(); i++) {
            Integer num = reverseColumnTitle.charAt(i) - 'A' + 1;
            columnNumber += num * Math.pow(26, i);
        }

        return columnNumber;
    }
}
