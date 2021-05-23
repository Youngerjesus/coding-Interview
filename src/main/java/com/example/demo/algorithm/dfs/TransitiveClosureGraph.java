package com.example.demo.algorithm.dfs;

import java.util.ArrayList;
import java.util.List;

public class TransitiveClosureGraph {
    private int vertices;
    private List<Integer>[] adjList;

    public TransitiveClosureGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v){
        adjList[u].add(v);
    }

    public int[][] solution(){
        int[][] to = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                boolean[] isVisited = new boolean[vertices];
                if(hasPath(isVisited,i,j)){
                   to[i][j] = 1;
                }
            }
        }

        return to;
    }

    private boolean hasPath(boolean[] isVisited, int u, int v) {
        if(u == v) return true;

        isVisited[u] = true;
        if(adjList[u].contains(v)){
            return true;
        }

        for(int adj : adjList[u]){
            if(!isVisited[adj] &&
                    hasPath(isVisited,adj,v)){
                return true;
            }
        }

        return false;
    }

    public int[][] otherSolution(){
        int[][] to = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            setPossiblePath(to, i);
        }
        return to;
    }

    private void setPossiblePath(int[][] to, int source) {
        boolean[] isVisited = new boolean[adjList.length];
        isVisited[source] = true;
        to[source][source] = 1;
        for (int i = 0; i < adjList[source].size(); i++) {
            Integer adj = adjList[source].get(i);
            nextPath(to,isVisited,source,adj);
        }
    }

    private void nextPath(int[][] to, boolean[] isVisited, int source, int current) {
        to[source][current] = 1;
        isVisited[current] = true;
        for (int i = 0; i < adjList[current].size(); i++) {
            Integer adj = adjList[current].get(i);
            if(!isVisited[adj]) nextPath(to, isVisited, source, adj);
        }
    }
}
