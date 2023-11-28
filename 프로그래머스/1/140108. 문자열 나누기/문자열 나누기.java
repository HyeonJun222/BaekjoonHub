class Solution {
        public int solution(String s){
            int answer = 0;

            // 첫 번째 문자 추출
            char c = s.charAt(0);

            // X 개수, X 아닌 개수 따로 담기
            int x = 0, nonX = 0;
            // x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
            for (int i = 0; i < s.length(); i++){
                if (x == nonX){
                    answer++;
                    c = s.charAt(i);
                }
                if(s.charAt(i)==c) x++;
                else nonX++;
            }
            return answer;
        }

}