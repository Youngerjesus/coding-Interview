package com.example.demo.leet_code.coure_schedule;

import java.util.*;

public class OtherSolution {
    // 1. indegree = 0 인 것들을 탐색
    // 2. 관련 edge 제거하고 indegree 업데이트
    // 3. 루프 종료 후 모든 노드 탐색했는지 확인
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            indegree[edge[0]]++;
            adjList.get(edge[1]).add(edge[0]);
        }


        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0){
                q.addFirst(i);
            }
        }

        Set<Integer> visited = new HashSet<>();
        while (!q.isEmpty()){
            int node = q.pollFirst();
            visited.add(node);
            for (int dest : adjList.get(node)) {
                indegree[dest]--;
                if(indegree[dest] == 0) q.addLast(dest);
            }
            adjList.get(node).clear();
        }

        return visited.size() == numCourses;
    }
}
