
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 모르면 zero로
        // 0의 개수를 저장하는 변수
        int zero = 0;
        // 일치하는 번호 개수를 저장하는 변수
        int matched = 0;
        
        // 주어진 로또 번호 배열을 순회하면서 0의 개수와 일치하는 번호 개수를 센다
        for (int i : lottos) {
            if (i == 0) // 현재 번호가 0이라면
                zero++; // zero 변수를 증가시킴
            else { // 현재 번호가 0이 아닌 다른 번호라면
                for (int j : win_nums) { // 당첨 번호 배열을 순회하면서
                    if (i == j) { // 현재 번호가 당첨 번호와 일치하는지 확인
                        matched++; // 일치하는 번호가 있으면 matched 변수를 증가시킴
                        break; // 일치하는 번호를 찾았으므로 더 이상 확인할 필요가 없으므로 반복문을 종료
                    }
                }
            }
        }
        
        // 최소 등수는 일치하는 번호의 개수와 같고, 최대 등수는 일치하는 번호의 개수와 0의 개수를 더한 값이다
        int min = matched;
        int max = matched + zero;
        
        // 최소 등수와 최대 등수를 배열로 만들어 반환
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}