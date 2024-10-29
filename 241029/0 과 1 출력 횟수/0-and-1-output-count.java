import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] dp0 = new int[n+1];
        int[] dp1 = new int[n+1];

        dp0[0] = 1;
        if (n >= 1) {
            dp1[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp0[i] = dp0[i-1] + dp0[i-2];
            dp1[i] = dp1[i-1] + dp1[i-2];
        }

        System.out.println(dp0[n] + " " + dp1[n]);
        
    }
}