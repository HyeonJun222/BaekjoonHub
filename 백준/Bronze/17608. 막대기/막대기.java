import java.util.Scanner;

// https://www.acmicpc.net/problem/17608
// 막대기
// 들어오는 숫자 배열로 담고
// 거꾸로 봤을때 기준보다 큰 것만 보이게 코딩할것
// ex) 6 6 9 7 6 4 6 <- 6을 기준으로 6 7 9 만보임 return 3;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();

        int count = 1;        // 오른쪽에서 보이는 갯수 기본 1
        int maxHeight = arr[arr.length - 1];    // 가장 높은 막대기의 높이

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxHeight) {
                count++;
                maxHeight = arr[i];
            }
        }

        System.out.println(count);
        scan.close();
    }
}
