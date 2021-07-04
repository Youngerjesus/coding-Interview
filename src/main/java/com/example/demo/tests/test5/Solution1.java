package com.example.demo.tests.test5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public int solution(int[] prices, int[] discounts) {
        List<Integer> priceList = Arrays.stream(prices)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> discountList = Arrays.stream(discounts)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(priceList, Collections.reverseOrder());
        Collections.sort(discountList, Collections.reverseOrder());
        int answer = 0;
        int discountIndex = 0;

        for (int i = 0; i < priceList.size(); i++) {
            if(discountIndex < discountList.size()){
                answer += priceList.get(i) - ((priceList.get(i) * discountList.get(discountIndex)) / 100);
                discountIndex++;
            }else {
                answer += priceList.get(i);
            }
        }

        return answer;
    }
}
