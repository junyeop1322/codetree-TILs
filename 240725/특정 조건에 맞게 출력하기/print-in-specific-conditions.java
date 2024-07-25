import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) {
                break;
            }

            if (n % 2 == 0) {
                sb.append(n/2 + " ");
            } else {
                sb.append(n+3 + " ");
            }
        }

        System.out.println(sb);
    }
}