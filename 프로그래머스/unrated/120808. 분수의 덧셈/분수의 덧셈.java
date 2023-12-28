class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];

        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        answer[1] = denom1 * denom2;

        // 두 개의 인자 중 작은 값을 리턴하여 min에 저장
        int min = Math.min(answer[0], answer[1]);
        int max = 1;

        for(int i = 1; i <= min; i++) {
            if(answer[0] % i == 0 && answer[1] % i == 0) {
                max = i; // i로 분자 분모 모두 나누어 떨어지는 수가 '최대 공약수'
                // 즉 max 는 최대공약수
            }
        }

        // 최대 공약수로 모두 약분
        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }
}