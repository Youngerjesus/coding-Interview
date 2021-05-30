package com.example.demo.leet_code.merge_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        int[] answer = new int[]{1,2,2,3,5,6};
        //when
        solution.merge(nums1,m,nums2,n);
        //then
        assertArrayEquals(answer, nums1);
    }
}