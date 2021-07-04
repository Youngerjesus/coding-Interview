package com.example.demo.tests.test4;

import java.util.*;

public class Solution2 {
    public int solution(int[] T, int[] A) {
        // write your code in Java SE 8
        Set<Integer> clearSkillTreeSet = new HashSet<>();
        Map<Integer, Boolean> clearSubSkillTreeMap = new HashMap<>();
        int clearCount = 0;

        while (clearSkillTreeSet.size() < A.length) {
            for (int i = 0; i < A.length; i++) {
                if(clearSkillTreeSet.size() == A.length){
                    break;
                }
                if(T[A[i]] != A[i]){
                    int parentSkill = A[i];
                    int subSkill = T[parentSkill];
                    while (T[subSkill] != subSkill) {
                        int nextSubSkill = T[subSkill];
                        if(nextSubSkill == T[nextSubSkill] && clearSubSkillTreeMap.getOrDefault(nextSubSkill, false)){
                            break;
                        }
                        parentSkill = subSkill;
                        subSkill = nextSubSkill;
                    }
                    if(!clearSubSkillTreeMap.getOrDefault(subSkill, false)) {
                        for (int j = 0; j < T.length; j++) {
                            if(T[j] == subSkill){
                                T[j] = j;
                            }
                        }

                        for (int j = 0; j < A.length; j++) {
                            if(subSkill == A[j]){
                                clearSkillTreeSet.add(subSkill);
                            }
                        }
                        clearCount++;
                        clearSubSkillTreeMap.put(subSkill, true);
                    }
                }else {
                    for (int j = 0; j < T.length; j++) {
                        if(T[j] == A[i]){
                            T[j] = j;
                        }
                    }
                    if(!clearSkillTreeSet.contains(A[i])){
                        clearCount++;
                        clearSkillTreeSet.add(A[i]);
                    }
                }
            }
        }

        return clearCount;
    }
}
