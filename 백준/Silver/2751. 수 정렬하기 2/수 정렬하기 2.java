import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 첫 정수 받음
        int N = Integer.parseInt(br.readLine());
        // 배열에 담기
        ArrayList<Integer> list = new ArrayList<>();
        // N 받는대로 배열에 넣어줌
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        // 배열 정리
        Collections.sort(list);
        // 출력준비
        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}