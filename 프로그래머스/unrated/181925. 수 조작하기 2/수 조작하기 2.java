class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int a = numLog[i] - numLog[i - 1];
            if (a == 1) {
                answer.append("w");
            } else if (a == -1) {
                answer.append("s");
            } else if (a == 10) {
                answer.append("d");
            } else if(a == -10){
                answer.append("a");
            }
        }
        return answer.toString();
    }
}