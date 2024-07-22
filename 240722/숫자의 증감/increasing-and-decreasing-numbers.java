import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String c = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (c.equals("A")) {
            for (int i = 1; i <= n; i++) {
                sb.append(i + " ");
            }
        } else if (c.equals("D")) {
            for (int i = n; i >= 1; i--) {
                sb.append(i + " ");
            }
        }

        System.out.println(sb);
    }
}