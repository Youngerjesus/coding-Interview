package com.example.demo.leet_code.zig_zag_conversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }

        int rotation = 0;
        int i = 0;
        while (i < s.length()) {
            if(rotation == 0) {
                for (int j = 0; j < numRows && i < s.length(); j++) {
                    list.get(j).add(s.charAt(i++));
                }

                if (numRows >= 2) {
                    rotation = numRows - 2;
                }else {
                    rotation = 0;
                }
            }
            else {
                list.get(rotation--).add(s.charAt(i++));
            }
        }

        StringBuilder result = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < list.get(j).size(); k++) {
                result.append(list.get(j).get(k));
            }
        }

        return result.toString();
    }
}
