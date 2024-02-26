import java.util.Scanner;
// https://www.acmicpc.net/problem/2753
// 윤년이면 1, 아니면 0 출력하시오
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int answer = 0;
        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0){
            answer = 1;
        }
        System.out.println(answer);
    }
}