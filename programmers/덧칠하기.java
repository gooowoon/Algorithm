class Solution {
    public int solution(int n, int m, int[] section) {
    // n : 전체 구역들의 수 (1m 간격)
    // m : 롤러의 길이(m)
    // section : 페인트를 칠 할 구역들의 번호가 담긴 정수 배열

        int answer = 0; // 페인트칠해야 하는 최소 횟수
        int index = 0; // 현재 처리 중인 배열 내의 위치(구역 번호)

        // 첫 번째 칠해야 하는 구역으로 초기화
        int head = section[index]; // 현재 칠하고 있는 구역의 시작점

        // section 배열의 마지막 원소로 초기화
        int tail = section[section.length - 1]; // 마지막으로 칠할 구역

        // 롤러질 최소화
        // 1. 전체 페인트칠 과정 관리 역할
        // 각 반복마다 롤러로 페인트칠을 할 수 있는 최대 구역을 정하고, 해당 구역을 칠했다고 간주한 후 head를 업데이트
        while (head <= tail) {

            // 롤러로 한 번 칠할 때 head 위치를 롤러 길이 m만큼 이동(다음 칠할 구역의 시작점)
            head = head + m;
            answer++;// 칠한 횟수 1 증가

            // 2. 현재 롤러로 칠하는 구역 다음에 칠할 구역을 찾는 역할
            // index < section.length : index가 section 배열의 범위 내에 있는지 확인
            // section[index] < head: 현재 처리하고 있는 구역(head)보다 앞에 있는 (이미 페인트칠이 완료된)구역들을 건너뜀
            // index가 배열의 길이를 초과, section[index]가 head보다 크거나 같아지면 종료
            while (index < section.length && section[index] < head) {
                index++;
            }

            // 더이상 칠할 구역이 없을 때
            if (index >= section.length) {
                return answer; // 현재까지 칠한 횟수 반환
            }

            // 다음 칠해야 할 section[index]로 업데이트
            head = section[index];
        }

        return answer; //최종 칠하는 횟수를 반환
    }
}