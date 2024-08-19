import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += func(Integer.parseInt(st.nextToken()));
        }

        System.out.println(ans);
    }

    static int func(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return n;
    }
}