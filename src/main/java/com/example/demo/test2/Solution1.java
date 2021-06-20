package com.example.demo.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution1 {
    public String solution(String S, String C) {
        String[] wordSplit = S.toLowerCase().split("; ");
        String c = C.toLowerCase();
        String domain = "@" + c + ".com;";

        List<String> emailList = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : wordSplit) {
            String[] nameSplit = word.trim().replaceAll("-", "").split(" ");
            String email = "";
            String name = "";

            if(nameSplit.length == 3) {
                if(nameSplit[2].length() > 8) {
                    nameSplit[2] = nameSplit[2].substring(0,8);
                }
                name = nameSplit[0] + "." + nameSplit[2];
            }
            else {
                if(nameSplit[1].length() > 8) {
                    nameSplit[1] = nameSplit[1].substring(0,8);
                }
                name = nameSplit[0] + "." + nameSplit[1];
            }

            Integer count = countMap.get(name);

            if(count == null) {
                email = name + domain;
            }
            else {
                String nameCount = String.valueOf(count + 1);
                email = name + nameCount + domain;
            }

            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
            emailList.add(email);
        }

        String s = emailList.stream()
                .reduce((s1, s2) -> s1 + " " + s2)
                .get();

        return s.substring(0, s.length()-1);
    }
}
