import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            // 젤 처음엔 그냥 넣고
            if (i == 0) stack.push(arr[i]);
            // peek()로 확인하고 다르면 넣기
            else if (stack.peek() != arr[i]) stack.push(arr[i]);
        }
        
        return stack.stream().mapToInt(i->i).toArray();
    }
}