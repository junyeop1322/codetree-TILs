import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(cnt + " ");
                cnt++;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}