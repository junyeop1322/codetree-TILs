import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int cnt = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(cnt + " ");
                cnt += 2;
                if (cnt >= 10) {
                    cnt = 2;
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}