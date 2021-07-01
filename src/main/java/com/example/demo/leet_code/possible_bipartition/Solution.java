package com.example.demo.leet_code.possible_bipartition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Integer, Color> colorMap = new HashMap<>();
    int[][] direction;

    public boolean possibleBipartition(int n, int[][] dislikes) {
        direction = new int[n+1][n+1];

        for (int i = 0; i < dislikes.length ; i++) {
            int from = dislikes[i][0];
            int to = dislikes[i][1];
            direction[from][to] = 1;
        }

        for (int i = 0; i < dislikes.length ; i++) {
            int from = dislikes[i][0];
            int to = dislikes[i][1];
            if(!colorMap.containsKey(from) && !colorMap.containsKey(to)){
                colorMap.put(from, Color.WHITE);
                colorMap.put(to, Color.BLACK);
            }

            if(colorMap.containsKey(from) && !colorMap.containsKey(to)) {
                colorMap.put(to, switchColor(colorMap.get(from)));
            }

            if(colorMap.containsKey(to) && !colorMap.containsKey(from)) {
                colorMap.put(from, switchColor(colorMap.get(to)));
            }

            if(!dfs(from, to, 0)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int from, int to, int interval) {
        Color fromColor = colorMap.get(from);
        Color toColor = colorMap.get(to);

        if(interval % 2 == 1 && fromColor != toColor) {
            return false;
        }

        if(interval % 2 == 0 && fromColor != switchColor(toColor)){
            return false;
        }

        for (int i = 0; i < direction[to].length; i++) {
            if(direction[to][i] == 1) {
                if (interval % 2 == 0) {
                    colorMap.put(i, fromColor);
                } else {
                    colorMap.put(i, switchColor(fromColor));
                }
                return dfs(from, i, ++interval);
            }
        }

        return true;
    }

    public Color switchColor(Color color){
        return color == Color.BLACK ? Color.WHITE : Color.BLACK;
    }
}

enum Color {
    WHITE, BLACK
}
