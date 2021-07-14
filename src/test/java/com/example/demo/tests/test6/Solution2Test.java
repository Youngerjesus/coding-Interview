package com.example.demo.tests.test6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void testCase1(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("2001:db8::ff00:42:8329");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase2(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("::1");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase3(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("1:22:333:4444");
        List<String> actual = new ArrayList<>();
        actual.add("Neither");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase4(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("20EE:Fb8:85a3:0:0:8A2E:0370:7334");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase5(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("2001:db8:85a3:0::8a2E:0370:7334");
        List<String> actual = new ArrayList<>();
        actual.add("Neither");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase6(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("2001:db8:85a3::8a2E:0370:7334");
        List<String> actual = new ArrayList<>();
        actual.add("Neither");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase7(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("12..33.4");
        List<String> actual = new ArrayList<>();
        actual.add("Neither");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase8(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("2001:0db8:85a3:0000:0:8A2E:0370:733a");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase9(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("2001:0db8:85a3:0:0:8A2E:0370:7334");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase10(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("1::1::1");
        List<String> actual = new ArrayList<>();
        actual.add("Neither");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase12(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("1::");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase13(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("22.000.157.141");
        List<String> actual = new ArrayList<>();
        actual.add("IPv4");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase14(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("0.1.2.3");
        List<String> actual = new ArrayList<>();
        actual.add("IPv4");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase15(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add(":1:");
        List<String> actual = new ArrayList<>();
        actual.add("Neither");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    // 1::1
    @Test
    void testCase16(){
        //given
        List<String> addresses = new ArrayList<>();
        addresses.add("::");
        List<String> actual = new ArrayList<>();
        actual.add("IPv6");
        //when
        List<String> expected = Solution2.validateAddresses(addresses);
        //then 2001:0db8:85a3:0:0:8A2E:0370:7334
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}