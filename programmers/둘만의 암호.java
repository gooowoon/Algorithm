class Solution {
    public String solution(String s, String skip, int index) {
        
        // 문자열 's'를 문자 배열로 변환
        char[] list = s.toCharArray();
        
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < index; j++) {
                // 현재 문자를 index만큼 뒤의 알파벳으로 이동
                // 'z'를 초과할 경우 모듈로 연산을 사용하여 'a'로 돌아감
                list[i] = (char) ((list[i] - 'a' + 1) % 26 + 'a');
                
                // 변환된 문자가 'skip' 집합에 속하는지 확인
                while (skip.contains(String.valueOf(list[i]))) {
                    // skip에 속한다면 다시 반복문을 사용
                    list[i] = (char) ((list[i] - 'a' + 1) % 26 + 'a');
                }
            }
        }
        
        // StringBuilder를 초기화 => 문자 배열을 다시 문자열로 변환
        StringBuilder result = new StringBuilder();
        result.append(list); // 변환된 문자 배열을 StringBuilder에 추가
        
        return result.toString();
    }
}

// s.toCharArray(): 문자열 s를 char 타입의 배열로 변환하는 메서드
// .length: 배열의 길이를 반환하는 속성

/* StringBuilder 특징
가변성(Mutable): 문자열을 효율적으로 수정 가능
메모리 효율성 : 문자열을 변경할 때마다 새로운 객체를 생성하는 String / StringBuilder는 기존의 데이터를 변경
동기화(Synchronization)되지 않음: StringBuilder는 스레드에 안전하지 않음 / 멀티스레드 환경에서 사용해야 하는 경우 StringBuffer를 대신 사용
메서드 체이닝(Chaining): append, delete, insert 등의 메서드를 연이어 호출 가능 */

// result.toString():  객체에 누적된 문자열을 일반적인 String 객체로 변환하는 메서드


