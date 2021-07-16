## SubString Search

목표: 큰 데이터 스트림에서 특정한 패턴을 찾아내는 것 

#### Brute Force

이 방법은 텍스트를 쭉 훑으면서 패턴의 첫글자와 텍스트의 글자가 일치하는지 확인하고 일치한다면 패턴의 포인터를 증가시키면서
패턴의 전부가 연속적으로 텍스트와 일치하는지 확인하는 알고리즘이다. 

중간에 패턴과 텍스트가 일치하지 않는다면 텍스트는 일치했던 첫글자의 다음 포인터로 이동시키고 패턴을 처음부터 다시 검색한다. 

이 방법의 문제점은 뭘까?

- 패턴과 비슷한 문자열이 텍스트에 많다면 많은 검색을 해야한다. 에를들면 패턴과 마지막 한 글자만 다른 문자열이 텍스트에 많다고 생각해보면 
 계속해서 검색이 진행될 것이다. 

- 최악의 경우에 O(M * N)

#### Knuth-Morris-Partt Algorithm  

Brute Force 에서 업그레이드 된 방법으로 MisMatch 가 났을때 기존에 나왔던 문자열과 패턴을 이용해 다음 백업 장소를 정하는
알고리즘

- 다음 백업 장소를 가기 위해선 DFA 라는 결정적 유한 상태 머신을 이용한다. 

DFA 는 어떻게 만들까?   

- 현재 상태에서 가리키는 곳에서 패턴의 다음 문자가 매칭 되면 가리키는 곳을 1씩 증가 시킨다.

- 패턴 매칭을 진행하면서 현재 패턴이 가리키는 곳과 접두사가 같다면 그곳으로 돌아가도록 백업 주소를 설정한다. 

KMP 알고리즘의 주의할 점 

- DFA 를 만드는데 O(R * M) 이 걸리고 R 은 Radix(패턴에서 나올 수 있는 가능한 문자들)를 말하고 M 는 패턴의 길이를 말한다.

- R 값이 너무 큰 유니코드를 사용한다면 DFA 를 만들때 많은 메모리를 사용할 것이다. 

#### Boyer-Moore Algorithm

패턴을 오른쪽에서 왼쪽으로 스캔을 하는 것

패턴 매칭에서 맨 마지막 글자가 서로 다르다면 그 글자가 등장하는 첫 위치만큼 땡기는 것. 

만약 텍스트에 있는 글자가 패턴에 없는 글자라면 패턴의 길이만큼 스킵하면 된다.

패턴을 오른쪽 부터 스캔 했을때 MisMatch 난 글자가 현재 포인터보다 더 오른쪽에 있다면 그만큼 백업되야 한다고 생각 할 수 있다.

하지만 텍스트에 있는 패턴 자체가 길이가 패턴과 동일하기 때문에 다시 되돌아갈 필요는 없다.     

직관적으로 생각해보면 이 알고리즘은 패턴이 한 글자로 이뤄진 경우가 아니라면 빠를 수 있다. 

KMP 는 선형시간 O(N) 을 보장했지만 Boyer Moore 의 경우에 잘 풀리면 N(text.length) / M(pattern.length) 만큼 시간을 줄일 수 있다. 브루트 포스(N * M)와 비교하면 엄청난 차이다.    

Boyer Moore 의 최악의 경우는 O(M * N) 인데 pattern 이 A B B B B 이고 text 가 B B B B B B B B B B  ... 으로 이뤄진 경우다. 
매번 하나의 skip 만 함으로써 브루트 포스 방법과 시간 복잡도는 같아진다.

#### Rabin-Karp Algorithm

이 알고리즘은 패턴 문자열 0 부터 M - 1 (패턴 문자열의 길이)를 해싱해놓고 텍스트 문자열을 순회하면서 i ~ i + M - 1 까지의 길이 값을 해싱하면서
비교하면서 매칭하는지 찾는 알고리즘이다.

이 알고리즘이 가능한 이유는 어떤 문자든지 바이트로 코드화 되어 있기 때문이다. 

이때 문자열 가지고 해시함수를 만들 땐 고유의 값을 만들도록 해야한다.  

그렇다면 이제 Rabin-Karp 알고리즘에서 중요한건 해시값을 얼마나 빠르게 구할 수 있는건지인데 텍스트에서 한칸식 진행하면서
새롭게 들어오는 문자를 이용하고 나가는 문자열을 이용해서 해시값을 빠르게 구할 수 있어야 한다.

헤시값을 구하는 식이 다음과 같다면 빠르게 구할 수 있다.

```
Xi = ti * R^(M - 1) + ti+1 * R^(M - 2) ... + ti+M-1 * R^0) 
Xi+1 = ti+1 * R^(M - 1) + ti+2 * R^(M - 2) ... + ti+M * R^0) 

Xi+1 = (xi - ti * R^(M - 1)) * R + ti+M 
```  

Rabin-Karp 알고리즘에선 해싱 매칭이 됐을때 결과를 반환하는 Monte-Carlo Version 이 있고 
해시 매칭과 함께 스트링 매치까지 한번 더 확인하는 Las Vegas Version 이 있다. Monte-Carlo Version 은
완벽한 Linear Time 을 보장하지만 1 / N 확률로 잘못된 결과를 반환할 수도 있다.
Las Vegas Version 은 완벽한 정답을 보장하지만 완벽한 Linear Time 을 보장하지는 않는다. 
Las Vegas Version 을 이용할 경우에 백업을 하는 경우도 충분히 생각해야 할 것이다. 

#### Summary 

|  Algorithm    |  Version    |  guarantee    |   typical   |   backup in input   |   correct?   | extra space  |
| :----: | :----: | :----: | :----: | :----: | :----: | :----: |
| Brute Force     |  X    |  M * N    | 1.1 * N     |  yes    |  yes    |  1    |
| Knuth-Morris-Pratt     |   Full DFA (Algorithm 5.6)  |  2 * N    |  1.1 * N    |  no    |   yes   |  MR   |
| Knuth-Morris-Pratt     |   mismatch transition only   |  3 * N    |  1.1 * N    |  no  |  yes    |   M   |
| Boyer-Moore     |  full algorithm     |  3 * N    |  N / M    |   yes   |   yes   |   R   |
| Boyer-Moore     |   mismatched char heuristic only (Algorithm 5.7)   |  M * N    |   N / M   |  yes    |  yes    |  R    |
| Rabin-Karp | Monte Carlo (Algorithm 5.8) | 7 * N | 7 * N | no | yes down | 1 |
| Rabin-Karp | Las vegas | 7 * N Over | :----: | 7 * N | yes | 1 |


 