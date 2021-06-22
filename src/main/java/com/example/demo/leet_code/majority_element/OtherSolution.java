package com.example.demo.leet_code.majority_element;

public class OtherSolution {
    public int majorityElement(int[] nums) {
        int majorElement = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length ; i++) {
            if(majorElement == nums[i]){
                count++;
            }
            else if(count == 0) {
                majorElement = nums[i];
                count = 1;
            }
            else {
                count--;
            }
        }

        return majorElement;
    }
}
