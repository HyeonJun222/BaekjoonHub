import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 15903
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");   // 토크나이저보다 이런식이 더 빠름
        // 카드 개수
        int cardCount = Integer.parseInt(info[0]);
        // 카드합체수
        int actions = Integer.parseInt(info[1]);

        // 카드
        String[] cards = br.readLine().split(" ");

        // 가장 작은 두 개의 카드를 골라서 합쳐야 총 합을 작게 유지가능
        // 그걸 위해 우선순위 큐에 넣어줌
        PriorityQueue<Long> smallestCards = new PriorityQueue<>();

        for (int i = 0; i < cardCount; i++) {
            smallestCards.offer(Long.parseLong(cards[i]));
        }
        // 총 행하는 합체 회수만큼 반복해서
        for (int i = 0; i < actions; i++) {
            // 1. 가장 작은 두 개의 카드를 받아오자.
            Long a = smallestCards.poll();
            Long b = smallestCards.poll();
            Long sum = a + b;
            // 2. 둘을 합친 숫자만큼 두 번 우선순위 큐에 넣어주자
            smallestCards.offer(sum);
            smallestCards.offer(sum);
        }
        // 3. 최종적으로 총 합 구하기
        long answer = 0;
        while(!smallestCards.isEmpty()){
            answer += smallestCards.poll();
        }
        System.out.println(answer);
    }
}