import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        // 숫자 문자열을 순회
        for (char digit : number.toCharArray()) {
            // 스택이 차있고, k 양수, 스택숫자가 현재 숫자보다 작을 때 숫자 하나 뽑고 k 감소
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit){
                stack.pop();
                k--;
            }
            // 숫자 추가
            stack.push(digit);
        }
        // k 가 남은경우
        while (k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()){
            answer.insert (0, stack.pop());
        }
        
        return answer.toString();
    }
}