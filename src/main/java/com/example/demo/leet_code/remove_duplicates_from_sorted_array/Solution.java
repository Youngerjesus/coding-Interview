package com.example.demo.leet_code.remove_duplicates_from_sorted_array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[prev] == nums[i]){
                int nextIdx = nextNum(nums, i);
                if(hasNexIdx(nextIdx)){
                    nums[++prev] = nums[nextIdx];
                    i = nextIdx - 1;
                }
            }else{
                prev++;
            }
        }

        return prev + 1;
    }

    private int nextNum(int[] nums, int current) {
        for (int i = current + 1; i < nums.length; i++) {
            if(nums[i] > nums[current]){
                return i;
            }
        }
        return -1;
    }

    private boolean hasNexIdx(int nextIdx) {
        return nextIdx != -1;
    }
}
