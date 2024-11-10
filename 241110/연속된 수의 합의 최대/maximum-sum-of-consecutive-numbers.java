import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long[] dp = new long[n];
        dp[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
        }
        
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        
        long maxSum = currentSum;
        
        for (int i = k; i < n; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
            maxSum = Math.max(maxSum, currentSum + dp[i - k]);
        }
        
        System.out.println(maxSum);
    }
}