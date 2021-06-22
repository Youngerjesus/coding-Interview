package com.example.demo.leet_code.reverse_bits;

public class Solution {
    public int reverseBits(int n) {
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(n));
        while (binaryString.length() < 32) binaryString.insert(0, "0");
        String reverseBinaryString = binaryString.reverse().toString();
        return Integer.parseUnsignedInt(reverseBinaryString, 2);
    }
}
