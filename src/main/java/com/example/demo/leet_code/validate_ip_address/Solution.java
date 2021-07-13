package com.example.demo.leet_code.validate_ip_address;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {
    public String validIPAddress(String IP) {
        String[] ipv4Strings = IP.split("\\.");
        String[] ipv6Strings = IP.split(":");

        if(isIpv4(IP, ipv4Strings)){
            return "IPv4";
        }
        else if(isIpv6(IP, ipv6Strings)){
            return "IPv6";
        }
        return "Neither";
    }

    private boolean isIpv4(String originalIp, String[] ipv4Strings) {
        if(originalIp.length() > 15) return false;

        if(originalIp.length() == 0 || originalIp.charAt(0) == '.' || originalIp.charAt(originalIp.length() - 1) == '.')
            return false;

        if(ipv4Strings.length != 4) return false;

        for (String subIpv4 : ipv4Strings) {
            if (subIpv4.equals("")) return false;

            if(!subIpv4.chars()
                    .allMatch(Character::isDigit)) return false;

            if(Integer.parseInt(subIpv4) < 0 || Integer.parseInt(subIpv4) > 255) {
                return false;
            }

            if(subIpv4.charAt(0) == '0' && subIpv4.length() >= 2) {
                return false;
            }
        }

        return true;
    }

    private boolean isIpv6(String originalIp, String[] ipv6Strings) {
        if(originalIp.length() > 39) return false;

        if(originalIp.length() == 0 || originalIp.charAt(0) == ':' || originalIp.charAt(originalIp.length() - 1) == ':')
            return false;

        if(ipv6Strings.length != 8) return false;

        for (String subIpv6 : ipv6Strings) {
            if (subIpv6.length() > 4 || subIpv6.length() == 0) {
                return false;
            }

            if(!subIpv6.chars()
                    .allMatch(c -> Character.isDigit(c) || (Character.isAlphabetic(c) && Character.toLowerCase(c) <= 'f'))){
                return false;
            }
        }

        return true;
    }
}
