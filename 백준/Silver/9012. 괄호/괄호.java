import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int tests = Integer.parseInt(reader.readLine());

    // 테스트케이스의 개수만큼 반복
    for (int i = 0; i < tests; i++)
        if (isVPS(reader.readLine())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    // 괄호를 검사하는 메서드를 만들자.
    public static boolean isVPS(String line) {
        // 1. 각 글자 중 열린 괄호를 담을 스택을 만들자
        Stack<Character> charStack = new Stack<>();
        // 2. 입력받은 문자열의 각 글자를 순회한다
        for (int i = 0; i < line.length(); i++){
            // 3. 만약 글자가 열린 괄호('(')라면 스택에 푸쉬
            char next = line.charAt(i);
            if (next == '('){
                charStack.push(next);
            }
            // 4. 아니라면 닫힌 괄호(')')이다.
            else{
                // 4-1.스택이 비었다면 잘못되었다면 false를 반환하자!
                if (charStack.empty()){
                    return false;
                }
                // 4-2.비어있지 않다면 pop()
                else charStack.pop();
            }
        }
        // 순회 종료
        return charStack.empty();
        // 스택이 비었는지 확인하고 반환하자.
    }
}