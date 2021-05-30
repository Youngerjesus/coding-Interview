package com.example.demo.leet_code.merge_sorted_array;

import java.util.Arrays;

public class OtherSolution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        int nums1CopyIdx = 0;
        int nums2Idx = 0;

        for (int i = 0; i < m + n; i++) {
            if(isIndexOutBound(nums1Copy, nums1CopyIdx) && isIndexInBound(nums2, nums2Idx)){
                nums1[i] = nums2[nums2Idx++];
            }
            else if(isIndexOutBound(nums2, nums2Idx) && isIndexInBound(nums1Copy, nums1CopyIdx)){
                nums1[i] = nums1Copy[nums1CopyIdx++];
            }
            else {
                nums1[i] = nums1Copy[nums1CopyIdx] < nums2[nums2Idx] ?
                            nums1Copy[nums1CopyIdx++] :
                            nums2[nums2Idx++];
            }
        }
    }

    private boolean isIndexOutBound(int[] arr, int idx) {
        return idx >= arr.length;
    }

    private boolean isIndexInBound(int[] arr, int idx) {
        return !isIndexOutBound(arr, idx);
    }

}
