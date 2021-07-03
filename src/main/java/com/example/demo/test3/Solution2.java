package com.example.demo.test3;

import java.util.*;
import java.util.stream.Collectors;

public class Solution2 {
    public int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        Map<Integer, List<Integer>> gradeMap = new HashMap<>();

        for (int i = 0; i < grade.length; i++) {
            List<Integer> studentList = gradeMap.getOrDefault(grade[i], new ArrayList<>());
            studentList.add(i);
            gradeMap.put(grade[i], studentList);
        }

        int rank = 1;

        Set<Integer> gradeList = Arrays.stream(grade)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> sortedGrade = gradeList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());


        for (Integer g : sortedGrade) {
            List<Integer> studentList = gradeMap.get(g);
            for (Integer student : studentList) {
                answer[student] = rank;
            }
            rank += studentList.size();
        }

        return answer;
    }
}
