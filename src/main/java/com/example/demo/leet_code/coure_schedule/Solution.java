package com.example.demo.leet_code.coure_schedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
             adjList.add(new ArrayList<>());
        }

        boolean[] isNotStartNumber = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int preRequisite = prerequisites[i][1];
            int requisite =  prerequisites[i][0];
            if (preRequisite == requisite) return false;
            isNotStartNumber[requisite] = true;
            adjList.get(preRequisite).add(requisite);
        }

        boolean[] isVisited = new boolean[numCourses];

        for (int i = 0; i < isNotStartNumber.length; i++) {
            if(!isNotStartNumber[i]) {
                boolean res = dfs(i, adjList, isVisited);
                if(!res) return false;
            }
        }

        boolean isAllTrue = true;
        for (int i = 0; i < isNotStartNumber.length; i++) {
            if(!isNotStartNumber[i]){
                isAllTrue = false;
            }
        }

        if(isAllTrue) return false;
        return true;
    }

    private boolean dfs(int start, List<List<Integer>> adjList, boolean[] isVisited) {
        isVisited[start] = true;
        List<Integer> nextList = adjList.get(start);

        for (int i = 0; i < nextList.size(); i++) {
            if(isVisited[nextList.get(i)]){
                return false;
            }
            else {
                boolean ret = dfs(nextList.get(i), adjList, isVisited);
                if(!ret) return false;
            }
        }
        isVisited[start] = false;
        return true;
    }
}
