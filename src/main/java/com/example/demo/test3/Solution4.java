package com.example.demo.test3;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public int[] solution(int N, int[] coffee_times) {
        List<Integer> orderList = new ArrayList<>();
        CoffeeExtraction coffeeExtraction = new CoffeeExtraction(N);

        int coffeeIndex = 0;
        while (orderList.size() < coffee_times.length) {
            while (coffeeExtraction.isAddOrderBookPossible() && coffeeIndex < coffee_times.length) {
                coffeeExtraction.addOrder(new OrderBook(coffeeIndex + 1, coffee_times[coffeeIndex]));
                coffeeIndex++;
            }

            List<OrderBook> complete = coffeeExtraction.make();
            complete.stream()
                    .forEach(orderBook ->  {
                        orderList.add(orderBook.coffeeId);
                    });
        }

        int[] answer = orderList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}

class CoffeeExtraction {
    int n;
    List<OrderBook> extractList;

    public CoffeeExtraction(int n) {
        this.n = n;
        extractList = new ArrayList<>();
    }

    public List<OrderBook> make() {
        List<OrderBook> complete = new ArrayList<>();
        List<OrderBook> removeList = new ArrayList<>();
        while (true) {
            int size = extractList.size();
            for (int i = 0; i < size; i++) {
                OrderBook order = extractList.get(i);
                if(--order.time == 0){
                    complete.add(order);
                    removeList.add(order);
                }
            }

            if (complete.size() >= 1) {
                for (int i = 0; i < removeList.size(); i++) {
                    extractList.remove(removeList.get(i));
                }
                break;
            }
        }

        return complete;
    }

    public boolean addOrder(OrderBook order) {
        if(extractList.size() < n) {
            extractList.add(order);
            return true;
        }
        return false;
    }

    public boolean isAddOrderBookPossible() {
        return extractList.size() < n;
    }
}

class OrderBook {
    int coffeeId;
    int time;

    public OrderBook(int coffeeId, int time) {
        this.coffeeId = coffeeId;
        this.time = time;
    }
}