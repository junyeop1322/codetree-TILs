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
        int cnt = 0;
        int num = 0;

        while (true) {
            if (cnt % 2 == 0) {
                if (b <= a + (int)Math.pow(-2, cnt) && b >= num) {
                    ans += b - num + 1;
                    break;
                }
            } else {
                if (b >= a + (int)Math.pow(-2, cnt) && b <= num) {
                    ans += num - b + 1;
                    break;
                }
            }

            ans += (int)Math.pow(2, cnt);
            num = a + (int)Math.pow(-2, cnt);
            cnt++;

            // System.out.println("cnt : " + cnt + ", ans : " + ans + ", num : " + num);
        }

        System.out.println(ans);
    }
}