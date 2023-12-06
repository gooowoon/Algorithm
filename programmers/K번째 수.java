import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        // commands의 결과를 저장할 배열 선언
        // 배열의 크기 = commands의 행의 개수와 동일
        int[] answer = new int[commands.length];
  
        // answer 배열의 인덱스 관리용
        int a = 0;

        // commands 배열의 각 행에 대해 반복
        // info: 현재 행의 정보
        for (int[] info : commands) {

            // 현재 행의 정보를 변수에 할당
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] index = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(index);

            answer[a++] = index[k - 1]; 

            // 다음 answer 배열의 인덱스로 이동
            //a++;
        }

        return answer;
    }
}


// Arrays.sort(): 오름차순으로 배열 정리 
// Arrays.copyOfRange(): 주어진 배열의 지정된 범위에 해당하는 부분 배열을 복사하여 새로운 배열을 생성하는 메소드