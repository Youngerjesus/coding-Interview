package com.example.demo.leet_code.maximum_product_subarray;

import java.util.stream.IntStream;

public class Solution {
    public int maxProduct(int[] nums) {
        MaxResult[] maxResults = new MaxResult[nums.length];
        maxResults[0] = new MaxResult(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0 || maxResults[i-1].isZero()) {
                maxResults[i] = new MaxResult(nums[i]);;
            }
            else {
                try {
                    MaxResult clone = (MaxResult) maxResults[i-1].clone();
                    clone.calculate(nums[i], maxResults[i-1]);
                    maxResults[i] = clone;
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, maxResults[i].getMaxValue());
        }

        return maxValue;
    }

    static class MaxResult implements Cloneable {
        Integer maxValue;
        Integer candidate;

        public MaxResult(Integer value) {
            if (value == 0) {
                maxValue = 0;
                return;
            }

            if (value < 0) {
                candidate = value;
                maxValue = value;
                return;
            }

            candidate = null;
            maxValue = value;
        }

        public MaxResult(int maxValue, int candidateValue) {
            this.maxValue = maxValue;
            this.candidate = candidateValue;
        }

        public int getMaxValue() {
            return maxValue;
        }

        public int getCandidateValue(){
            return candidate;
        }

        public void calculate(int val, MaxResult maxResult){
            maxValue = Math.max(maxValue, Math.max(val * maxResult.getMaxValue(), val * maxResult.getCandidateValue()));
            candidate = Math.min(candidate, Math.min(val * maxResult.getCandidateValue(), val * maxResult.getMaxValue()));
        }

        public boolean hasCandidate(){
            return candidate != null;
        }

        public boolean isZero() {
            return maxValue == 0;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}