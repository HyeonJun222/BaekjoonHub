class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split(" "); // 공백을 기준으로 문자열 자르기

        // 공백을 기준으로 잘려진 문자열의 수만큼 반복
        for (int i = 0; i < sp.length; i++) {
            // 단어가 공백일 경우 반환값에 공백 추가
            if (sp[i].length() == 0) answer += " ";
            else {
                // 첫글자 대문자만들기
                answer += sp[i].substring(0, 1).toUpperCase();
                
                // 첫글자를 제외하고 소문자로 변환하여 더하기 + 띄어쓰기
                answer += sp[i].substring(1, sp[i].length()).toLowerCase() + " ";
            }
        }
		// 마지막에 공백 두 개 일 경우
		if (s.substring(s.length() -1, s.length()).equals(" ")) return answer;


        // 마지막에 공백이 더해져서 그 공백을 제외한 answer값 반환
        return answer.substring(0, answer.length() - 1); 
    }
}