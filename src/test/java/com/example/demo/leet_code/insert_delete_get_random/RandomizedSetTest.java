package com.example.demo.leet_code.insert_delete_get_random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {
    RandomizedSet randomizedSet = new RandomizedSet();

    @Test
    @DisplayName("1,2 추가 후 Random")
    void testCase1(){
        //given
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        //when
        int random = randomizedSet.getRandom();
        //then
        System.out.println(random);
    }

}