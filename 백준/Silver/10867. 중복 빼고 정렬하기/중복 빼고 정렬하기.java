import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // N 의 정수 받고
        int N = Integer.parseInt(br.readLine());

        // 중복자 제거하고 배열 넣을거 받기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // HashSet 에 저장 (중복값 날리기!)
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(
                    Integer.parseInt(st.nextToken())
            );
        }

        // 오름차순 정렬해주기 위해 리스트에 다시 담고 sort 해줌
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        // 출력준비
        for (int value : list) {
            sb.append(value).append(" ");
        }
        System.out.print(sb.toString());
    }
}
