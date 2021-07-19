## Dynamic Programming 

#### Dynamic Programming 문제 판단 기준 

- 문제의 조건 자체가 최적의 문제를 구하는 경우가 많다. 그리고 Overlapping subProblem 또는 Optimal subStructure 을 해결할 수 있는 경우라면
DP 문제라고 생각하면 된다. 

#### Dynamic Programming 문제 처리 순서 

##### step 1. How to solve a Dynamic Programming Problem ?

- Overlapping subProblems 문제인지 아니면 Optimal Substructure 을 가지는 문제인지 판단하고 둘 중 하나로 해당된다면 DP 문제로 판단이 가능하다. 

##### step 2. Deciding the state 

- DP 의 모든 문제는 State 와 State 를 변환시키는 Transition 이 있다. SubProblem 을 정의하는 State 를 정의하자.   

##### step 3. Formulating a relation among the states

##### step 4: Adding memoization or tabulation for the state 
 
#### Tabulation vs Memorization 

|      | Tabulation (Bottom-Up)     | Memorization (Top-Down)     |
| :----: | :----: | :----: |
| State     | State transition relation is difficult to think     |  State transition relation is easy    |
| Code     | Code gets complicated when lot of conditions are required     |  Code is easy and less complicated    |
| Speed      | Fast as we directly access previous states from the table    | Slow due to lot of recursive calls and return statements     |
| SubProblem solving     | If all subproblems must be solved at least once, a bottom-up dynamic programming algorithm usually outperforms a top-down memorized algorithm by a constant factor      | if some subproblems in the subproblem space need not be solved at all, the memorized solution has the advantage of solving only these subproblems that are definitely required     |
| Table Entries     | In Tabulation version, starting from the first entry, all entries are filled one by one   | Unlike the Tabulation version, all entries of the lookup table are not necessarily filed in Memorization version. The table is filed on demand.      |


