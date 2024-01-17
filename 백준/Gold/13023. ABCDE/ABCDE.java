import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 1. 친구들의 관계를 ArrayList<ArrayList<Integer>>에 저장합니다.
// 2. DFS(깊이 우선 탐색)을 이용하여 시작 노드 0~N-1까지 모든 경우를 탐색합니다.
// 3. 탐색 중 규칙에 만족하는 경우가 존재할 경우 탐색을 종료하고 1을 결과로 출력합니다.
// 4. 모든 탐색이 종료되었지만 규칙이 만족하지 못하면 0을 결과로 출력합니다.
public class Main {
    static int N, M;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();    // 친구 관계 저장 리스트
    static boolean[] visited;        // 해당 친구 도달했는지 확인 배열

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력값 처리하는 BufferedReader
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++)        // 그래프 초기화
            graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {        // 친구 관계 입력값 저장
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 양방향으로 a,b일 때와 b,a를 모두 저장
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        br.close();

        for (int i = 0; i < N; i++) {        // 각 노드 기준 DFS 탐색 시작
            visited = new boolean[N];
            dfs(i, 1);
        }


        System.out.println("0\n");        // DFS 탐색 후 규칙 만족 안할 때 0 출력

    }

    //DFS를 통해 규칙을 만족하면 1을 출력하는 함수
    static void dfs(int cur, int count) {
        if (count == 5) {    //규칙 만족할 때
            System.out.println("1");        // 결과 1 출력
            System.exit(0);         // 시스템 종료
        }
        visited[cur] = true;        // 해당 친구 도달 완료
        for (int i = 0; i < graph.get(cur).size(); i++) {
            if (!visited[graph.get(cur).get(i)]) {  // 다른 친구 도달 가능시
                dfs(graph.get(cur).get(i), count + 1);
            }
        }
        visited[cur] = false;    // 해당 친구 도달 취소
    }
}