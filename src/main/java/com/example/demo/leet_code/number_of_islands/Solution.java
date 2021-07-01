package com.example.demo.leet_code.number_of_islands;

public class Solution {
    int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1' && !isVisited[i][j]) {
                    isVisited[i][j] = true;
                    count++;
                    dfs(grid, isVisited, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, boolean[][] isVisited, int y, int x) {
        for (int i = 0; i < direction.length; i++) {
            int nextX = direction[i][0] + x;
            int nextY = direction[i][1] + y;
            if(isValid(nextX, nextY, grid) &&
                    grid[nextY][nextX] == '1' &&
                    !isVisited[nextY][nextX]){
                isVisited[nextY][nextX] = true;
                dfs(grid, isVisited, nextY, nextX);
            }
        }
    }

    private boolean isValid(int nextX, int nextY, char[][] array) {
        return (nextY >= 0 && nextY < array.length) && (nextX >= 0 && nextX < array[nextY].length);
    }

}
