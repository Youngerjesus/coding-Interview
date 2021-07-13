package com.example.demo.leet_code.validate_ip_address;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1() {
        String IP = "256.256.256.256";
        String actual = "Neither";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        String actual = "Neither";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase3(){
        String IP = "1e1.4.5.6";
        String actual = "Neither";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase4() {
        String IP = "255.255.255.255";
        String actual = "IPv4";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase5() {
        String IP = "172.16.254.1";
        String actual = "IPv4";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase6(){
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String actual = "IPv6";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase7(){
        String IP = "2001:0db8:85a3:0000:0:8A2E:0370:733a";
        String actual = "IPv6";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase10() {
        String IP = "02001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String actual = "Neither";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase11(){
        String IP = "12..33.4";
        String actual = "Neither";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase12(){
        String IP = "2001:db8:85a3:0::8a2E:0370:7334";
        String actual = "Neither";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }

    @Test
    void testCase13(){
        String IP = "20EE:Fb8:85a3:0:0:8A2E:0370:7334";
        String actual = "IPv6";
        String expected = solution.validIPAddress(IP);

        assertEquals(expected, actual);
    }
}