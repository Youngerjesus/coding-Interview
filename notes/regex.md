## 정규 표현식 


***

연습용 사이트

- https://regexr.com/5ml92

정규 표현식은 어떻개 사용하는가?
- 특정한 문자열의 패턴을 찾기

- 찾은 문자열을 다른 문자열로 변환하기

- 특정한 문자열이 이 패턴에 맞는지 확인하기 

## 정규표현식 문법 

#### Groups and ranges 

- `|` 또는 

- `()` 그룹, 

- `(?:)` 찾지만 그룹 지정 X
 
- `[]` 문자 셋을 말함. 문자 셋중에서 하나라도 만족하면 찾음. 

- `[^]` 부정 문자셋을 말함. 어떤 문자가 아닐때 라는 조건이 필요할 때 사용한다. `[^a-zA-Z0-9]` `^` 를 이용하면 `Not` 으로 사용되서 
  이것들을 제외한 문자를 찾도록 할 수 있음.
  

#### Quantifiers

- `?` 는 `?` 왼쪽에 있는 문자가 있거나 없거나 를 체크한다. 

- `*` 는 `*` 왼쪽에 없거나 있거나 많은지 모두 체크한다. 

- `+` 는 `+` 왼쪽에 하나 있거나 그것보다 많은지 체크한다. 

- `{2}` 는 `{2}` 왼쪽에 있는 글자를 최소 2 횟수만큼 존재하는지 체크한다.   

- `{2,3}` 는 `{2,3}` 왼쪽에 있는 글자가 최소 2 최대 3 만큼 존재하는지 체큰한다. 

#### Boundary-type

- `\b` 는 단어 경계를 말하고 `\bYa` 는 `Ya` 로 시작하는 문자열에서 `Ya` 를 찾을 때 사용한다. 
마찬가지로 `Ya\b` 는 `Ya` 로 끝나는 문자열에서 `Ya` 를 찾을 때 사용한다. 

- `\B` 는 단어 경계를 제외하는 걸 말한다. `\BYa` 는 `Ya 로 시작하는 문자열에서 `Ya` 를 제외하고 찾는다.

- `^` 는 문장에서 시작하는 문자열을 찾는다. `^Ya` 는 하나의 문장에서 `Ya` 로 시작한다면 그 부분을 찾는다

- `$` 는 문장에서 끝나는 문자열을 찾는다. `Ya$` 는 하나의 문장에서 `Ya` 로 끝난다면 그 부분을 찾는다. 

#### Character classes

- `.`  : any character except newline  

- `\w` : word

- `\d` : digit

- `\s` : whitespace

- `[abc]` : any of a, b, or c

- `[^abc]` : not a, b, or c

- `[a-g]` : character between a & g



  
  