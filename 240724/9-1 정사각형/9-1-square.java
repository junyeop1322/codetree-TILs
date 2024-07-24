import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int cnt = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(cnt);
                cnt--;
                if (cnt == 0) {
                    cnt = 9;
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}