package com.example.demo.tests.test3;

public class Solution3 {
    public int solution(int n) {
        int startFiveCount = n / 5;
        int startThreeCount = 0;


        while (startFiveCount >= 0) {
            while (result(startFiveCount, startThreeCount) <= n){
                if(result(startFiveCount, startThreeCount) == n){
                    return startFiveCount + startThreeCount;
                }
                startThreeCount += 1;
            }
            startThreeCount = 0;
            startFiveCount -= 1;
        }
        return -1;
    }

    private int result(int startFiveCount, int startThreeCount) {
        return 5 * startFiveCount + 3 * startThreeCount;
    }
}
