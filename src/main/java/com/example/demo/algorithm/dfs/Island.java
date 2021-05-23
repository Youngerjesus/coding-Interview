package com.example.demo.algorithm.dfs;

public class Island {
    private int[][] mat;
    private int[][] DIRECTION = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

    public Island(int[][] mat) {
        this.mat = mat;
    }

    public int solution(){
        boolean[][] isVisited = new boolean[mat.length][mat[0].length];
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(isFindNewIsland(isVisited, i, j)){
                    dfs(isVisited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isFindNewIsland(boolean[][] isVisited, int y, int x){
        return mat[y][x] == 1 && !isVisited[y][x];
    }

    private void dfs(boolean[][] isVisited, int y, int x) {
        isVisited[y][x] = true;
        for (int i = 0; i < DIRECTION.length; i++) {
            if(isConnected(isVisited, y + DIRECTION[i][0], x + DIRECTION[i][1])){
                dfs(isVisited, y + DIRECTION[i][0], x + DIRECTION[i][1]);
            }
        }
    }

    private boolean isConnected(boolean[][] isVisited, int y, int x){
        return (y >= 0 && y < mat.length) &&
                (x >= 0 && x < mat[y].length) &&
                !isVisited[y][x] &&
                mat[y][x] == 1;
    }
}
