import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        reader.close();
        // 계산해보자

        StringBuilder sb = new StringBuilder();

        sb.append(a * (b % 10));
        sb.append('\n');

        sb.append(a * ((b % 100) / 10));
        sb.append('\n');

        sb.append(a * (b / 100));
        sb.append('\n');

        sb.append(a * b);

        System.out.println(sb);
    }
}
