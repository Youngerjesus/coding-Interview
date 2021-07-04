package com.example.demo.tests.test4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OtherSolution2 {
    public int solution(int[] T, int[] A) {
        int[] inDegree = new int[T.length];
        List<List<Integer>> nextSkillList = new ArrayList<>();
        List<List<Integer>> preSkillList = new ArrayList<>();

        for (int i = 0; i < T.length; i++) {
            nextSkillList.add(new ArrayList<>());
            preSkillList.add(new ArrayList<>());
        }

        for (int i = 0; i < T.length; i++) {
            nextSkillList.get(T[i]).add(i);
            if(i != T[i]) preSkillList.get(i).add(T[i]);
            if(i != T[i]) inDegree[i]++;
        }

        Set<Integer> clearAllSkill = new HashSet<>();
        Set<Integer> clearSkill = new HashSet<>();
        while (clearSkill.size() != A.length){
            for (int i = 0; i < A.length; i++) {
                if(inDegree[A[i]] == 0){
                    clearAllSkill.add(A[i]);
                    clearSkill.add(A[i]);
                    for (int skill : nextSkillList.get(A[i])) {
                        inDegree[skill]--;
                    }
                }
                else {
                    List<Integer> subSkillList = preSkillList.get(A[i]);
                    while (!subSkillList.isEmpty()){
                        if(preSkillList.get(subSkillList.get(0)).size() == 0) {
                            break;
                        }
                        subSkillList = preSkillList.get(subSkillList.get(0));
                    }

                    for (int subSkill : subSkillList) {
                        for (int subNextSkill : nextSkillList.get(subSkill)){
                            inDegree[subNextSkill]--;
                        }
                        clearAllSkill.add(subSkill);
                    }
                    subSkillList.clear();
                }
            }
        }

        return clearAllSkill.size();
    }
}
