import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) { 
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    cnt++;
                    sb.append(cnt + " ");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    cnt += 2;
                    sb.append(cnt + " ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}