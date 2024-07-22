import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(a/b + ".");

        a %= b;

        for (int i = 0; i < 20; i++) {
            a *= 10;
            sb.append(a/b);

            a %= b;
        }

        System.out.println(sb);
    }
}