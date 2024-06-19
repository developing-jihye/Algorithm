# Algorithm

## 소개

안녕하세요. 저는 알고리즘 학습을 위해 백준과 프로그래머스 문제를 풀고 있습니다. 

이 레포지토리는 제 연습장입니다.

새롭게 알게 되었거나, 잊고 있었던 사소한 개념들을 기록하고 메모합니다.

문제 풀이를 통해 알고리즘 실력을 향상시키고자 노력합니다.


## 메모장
### 백준
* psvm
* Scanner
* 이스케이프 문자
* [11382] 자료형 Long -> 조건(1 ≤ A, B, C ≤ 10^12)

* 아스키 코드
     * 영어
          * A = 65, Z = 90
          * a = 97, z = 122
     * 숫자
          * '0' = 48, '9' = 57
      

* BufferedReader와 BufferedWriter
    * 버퍼링 없는 방식
        * 편지를 한 줄 쓸 때마다 우체통에 넣고 오는 상황.
        * 즉, 매번 데이터를 읽고 쓸 때마다 디스크나 네트워크 등의 I/O 작업을 수행하는 것.
    * 버퍼링된 방식
        * 여러 줄의 편지를 한 번에 써서 우체통에 한 번에 넣고 오는 상황.
        * 즉, 데이터를 버퍼에 모아 두었다가 한꺼번에 디스크나 네트워크에 쓰거나 읽는 것.
    *  flush() 메서드
        *  flush() 메서드를 호출하면 현재 버퍼에 있는 모든 데이터가 강제로 출력됨
    * readLine() 메서드
        * 스트림에서 한 줄을 읽어서 문자열로 반환. 예외 처리 필수

* StringTokenizer: 문자열을 지정된 구분자를 기준으로 분리. 문자열을 토큰(token)으로 분할
    * StringTokenizer(String str): 공백을 구분자로 사용하여 문자열을 토큰으로 분할
    * StringTokenizer(String str, String delim): 지정된 구분자를 사용하여 문자열을 토큰으로 분할
    * hasMoreTokens(): 다음 토큰이 있는지 확인
    * nextToken(): 다음 토큰을 반환
    * countTokens(): 남아있는 토큰의 수를 반환

## 정보
* 사용 언어: Java
* 개발 환경: 인텔리제이
* 플랫폼: 백준 허브
* [문제 풀이에 참고한 블로그](https://st-lab.tistory.com/category/JAVA%20-%20%EB%B0%B1%EC%A4%80%20%5BBAEK%20JOON%5D)
