package com.example.demo.leet_code.merge_sorted_array;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Idx = 0;
        int num2Idx = 0; 
        int insertCount = 0;

        while (num2Idx < n){
            if(num1Idx >= m + insertCount){
                pushTo(nums1, num1Idx++, nums2[num2Idx++]);
            }
            else if(nums1[num1Idx] > nums2[num2Idx]){
                insertTo(nums1, num1Idx++, nums2[num2Idx++]);
                insertCount++;
            }else {
                num1Idx++; 
            }
        }
    }

    private void insertTo(int[] arr, int idx, int val) {
        for (int i = arr.length - 2; i >= idx; i--) {
            arr[i+1] = arr[i];  
        }
        arr[idx] = val; 
    }

    private void pushTo(int[] nums1, int idx, int val) {
        nums1[idx] = val;
    }
}
