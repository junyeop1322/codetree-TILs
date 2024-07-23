import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = 0; j < n - i + 1; j++) {
                    sb.append("* ");
                }
            } else {
                for (int j = 0; j < i - n + 1; j++) {
                    sb.append("* ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}