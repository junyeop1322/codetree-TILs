import java.io.*;
import java.util.*;

public class Main {

    static int ans, c;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        ans = 0;

        for (int i = 0; i * a <= c; i++) {
            int cnt = a * i;

            int num = (c - cnt) / b;
            cnt += num * b;

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}