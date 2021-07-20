package com.example.demo.leet_code.coure_schedule;

import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Set<Integer>> requisiteEdges = new ArrayList<>();
        List<List<Integer>> preRequisiteEdges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            requisiteEdges.add(new HashSet<>());
            preRequisiteEdges.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int requisite = prerequisites[i][0];
            int preRequisite = prerequisites[i][1];
            requisiteEdges.get(requisite).add(preRequisite);
            preRequisiteEdges.get(preRequisite).add(requisite);
        }

        boolean[] isVisited = new boolean[numCourses];
        Queue<Integer> preCourseQueue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (requisiteEdges.get(i).isEmpty()) {
                isVisited[i] = true;
                preCourseQueue.add(i);
            }
        }

        int numCompleteCourse = 0;
        while (!preCourseQueue.isEmpty()) {
            Integer preCourse = preCourseQueue.poll();

            for (int i = 0; i < preRequisiteEdges.get(preCourse).size(); i++) {
                Integer course = preRequisiteEdges.get(preCourse).get(i);
                Set<Integer> requisiteEdgeSet = requisiteEdges.get(course);
                requisiteEdgeSet.remove(preCourse);
                if (requisiteEdgeSet.isEmpty() && !isVisited[course]) {
                    preCourseQueue.add(course);
                    isVisited[course] = true;
                }
            }

            numCompleteCourse++;
        }

        return numCompleteCourse == numCourses;
    }

}
