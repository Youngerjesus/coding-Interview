package com.example.demo.leet_code.merge_sorted_array;

import java.util.Arrays;

public class OtherSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
