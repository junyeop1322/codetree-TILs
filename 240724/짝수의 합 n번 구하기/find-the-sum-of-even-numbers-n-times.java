import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }

            sb.append(sum + "\n");
        }

        System.out.println(sb);
    }
}