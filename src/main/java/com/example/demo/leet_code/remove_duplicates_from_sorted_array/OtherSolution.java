package com.example.demo.leet_code.remove_duplicates_from_sorted_array;

public class OtherSolution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[prev] != nums[i]){
                nums[++prev] = nums[i];
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
