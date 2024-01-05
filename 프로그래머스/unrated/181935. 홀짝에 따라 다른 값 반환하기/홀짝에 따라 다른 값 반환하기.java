class Solution {
    public int solution(int n) {
        int answer = 0;
        int odd = 0;    // 홀
        int even = 0;   // 짝
        
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0) {
                even += i * i;
            }
            else odd += i;
        }
        
        answer = n % 2 == 0 ? even : odd;
        
        return answer;
    }
}