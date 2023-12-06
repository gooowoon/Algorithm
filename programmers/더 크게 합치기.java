import java.lang.*;
class Solution {
    public int solution(int a, int b) {

        // a와 b를 문자열로 변환
        String key1 = "" + a + b;

        // b와 a를 문자열로 변환
        String key2 = "" + b + a;

        // Integer.valueOf() 메소드: 문자열을 정수로 변환 
        int answer1 = Integer.valueOf(key1);
        int answer2 = Integer.valueOf(key2);

        // answer1과 answer2를 비교하여 더 큰 값을 반환
      //  if (answer1 > answer2) {
        //    return answer1;
        //} else {
          //  return answer2;
        // }

        return Math.max(answer1, answer2);
    }
}