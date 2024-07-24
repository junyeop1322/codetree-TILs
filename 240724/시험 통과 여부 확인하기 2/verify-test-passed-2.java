import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for (int t = 0; t < n; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = 0;
            for (int i = 0; i < 4; i++) {
                num += Integer.parseInt(st.nextToken());
            }

            if (num >= 240) {
                cnt++;
                sb.append("pass\n");
            } else {
                sb.append("fail\n");
            }
        }

        sb.append(cnt + "\n");
        System.out.println(sb);
    }
}