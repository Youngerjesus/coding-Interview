package com.example.demo.leet_code.possible_bipartition;

import java.util.ArrayList;
import java.util.List;

public class OtherSolution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adjList = new ArrayList<>();

        boolean[] visited = new boolean[n+1];
        boolean[] color = new boolean[n+1];

        for (int i = 0; i <= n ; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] d :dislikes){
            int a = d[0];
            int b = d[1];
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        for (int i = 0; i <= n; i++) {
            if(!visited[i]){
                visited[i] = true;
                boolean res = isBipartiteDfs(i, adjList, visited, color);
                if(!res) return false;
            }
        }

        return true;
    }

    private boolean isBipartiteDfs(int cur, List<List<Integer>> adjList, boolean[] visited, boolean[] color) {
        for (int next : adjList.get(cur)) {
            if(!visited[next]){
                visited[next] = true;
                color[next] = !color[cur];
                boolean res = isBipartiteDfs(next, adjList, visited, color);
                if(!res) return false;
            }
            else if(color[next] == color[cur]){
                return false;
            }
        }

        return true;
    }
}
