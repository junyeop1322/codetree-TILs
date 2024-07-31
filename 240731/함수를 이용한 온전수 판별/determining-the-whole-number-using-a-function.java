import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(count(n, m));
    }

    static int count(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || (i % 3 == 0 && i % 9 != 0) || (i % 5 == 0 && (i / 5) % 2 == 1)) {
                continue;
            } else {
                cnt++;
            }
        }

        return cnt;
    }
}