import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1];

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (arr[i-1] <= arr[i-2]) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + 1;
            }
        }
    

        System.out.println(dp[n]);
    }
}