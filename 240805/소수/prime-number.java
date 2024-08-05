import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        int min = b;

        for (int i = a; i <= b; i++) {
            int cnt = 0;

            if (i == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt = 1;
                    break;
                }
            }

            if (cnt == 0) {
                ans += i;
                min = Math.min(min, i);
            }
        }

        if (ans == 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
            System.out.println(min);
        }
    }
}