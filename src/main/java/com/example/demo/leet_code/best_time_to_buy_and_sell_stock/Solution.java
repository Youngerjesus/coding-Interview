package com.example.demo.leet_code.best_time_to_buy_and_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
