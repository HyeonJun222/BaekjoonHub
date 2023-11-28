class Solution {
        public int solution(String s){
            int answer = 0;
            char c = s.charAt(0);
            int x = 0, nonX = 0;
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