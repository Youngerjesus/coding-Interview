package com.example.demo.leet_code.best_time_to_buy_and_sell_stock_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
