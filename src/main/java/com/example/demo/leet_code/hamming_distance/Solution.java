package com.example.demo.leet_code.hamming_distance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        String binaryString = Integer.toBinaryString(xor);
        int diff = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') diff++;
        }
        return diff;
    }
}
