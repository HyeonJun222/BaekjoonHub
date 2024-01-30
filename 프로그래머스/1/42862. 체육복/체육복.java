import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 도난 안당한 학생 수를 반환하면 됨
        int answer = n - lost.length;
        
        // 여벌 체육복을 가져온 학생이 도난당한 경우 제외
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1; // 도난당한 학생을 -1로 표시하여 제외
                    reserve[j] = -1; // 여벌 체육복을 가져온 학생도 -1로 표시하여 제외
                    answer++; // 여분이 있어서 본인꺼를 입을 수 있으므로 수업을 들을 수 있는 학생 수 증가
                    break;
                }
            }
        }
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 도난당한 학생에게 체육복 빌려주기
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    reserve[j] = -1; // 빌려준 학생은 -1로 표시하여 중복 빌려주지 않도록 처리
                    answer++; // 체육복을 빌려준 학생을 포함하여 수업을 들을 수 있는 학생 수 증가
                    break;
                }
            }
        }
        return answer;
    }
}