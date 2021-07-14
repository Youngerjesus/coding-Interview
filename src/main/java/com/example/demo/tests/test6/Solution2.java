package com.example.demo.tests.test6;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static List<String> validateAddresses(List<String> addresses) {
        // Write your code here
        List<String> result = new ArrayList<>();

        for (String ipAddress : addresses) {
            String[] splitIpv4 = ipAddress.split("\\.");
            String[] splitIpv6 = ipAddress.split(":");

            if(isIPv4(ipAddress, splitIpv4)) {
                result.add("IPv4");
            }
            else if (isIPv6(ipAddress, splitIpv6)) {
                result.add("IPv6");
            }
            else {
                result.add("Neither");
            }
        }

        return result;
    }

    private static boolean isIPv4(String ipAddress, String[] splitIpv4) {
        if (ipAddress.length() > 15) return false;

        if (ipAddress.length() == 0 || ipAddress.charAt(0) == '.' || ipAddress.charAt(ipAddress.length() - 1) == '.') return false;

        if (splitIpv4.length != 4) return false;

        for (String subIpv4 : splitIpv4) {

            if (subIpv4.equals("")) return false;

            if(!subIpv4.chars()
                    .allMatch(Character::isDigit)) return false;

            if(Integer.parseInt(subIpv4) < 0 || Integer.parseInt(subIpv4) > 255) {
                return false;
            }

            if(subIpv4.charAt(0) == '0' && Integer.parseInt(subIpv4) > 7) {
                return false;
            }
        }
        return true;
    }

    private static boolean isIPv6(String ipAddress, String[] splitIpv6) {
        if(ipAddress.length() > 39 || splitIpv6.length > 8) return false;

        if (ipAddress.matches("::")) return true;

        if (ipAddress.matches(":.*:")) return false;

        if(ipAddress.length() == 0)
            return false;

        int semiColonCount = 0;
        boolean isTwoSemiColon = false;

        for (int i = 0; i < splitIpv6.length; i++) {
            String subIpv6 = splitIpv6[i];

            if(subIpv6.equals("") && isTwoSemiColon && !splitIpv6[i-1].equals("")) return false;

            if (subIpv6.equals("")) {
                semiColonCount++;
                isTwoSemiColon = true;
                continue;
            }

            if (subIpv6.length() > 4) {
                return false;
            }

            if(!subIpv6.chars()
                    .allMatch(c -> Character.isDigit(c) || (Character.isAlphabetic(c) && Character.toLowerCase(c) <= 'f'))){
                return false;
            }

        }

        if (semiColonCount == 0 && splitIpv6.length == 1) return true;
        if (semiColonCount == 0 && splitIpv6.length != 8) return false;
        if (semiColonCount == 1 && splitIpv6.length > 6) return false;

        return true;
    }

}
