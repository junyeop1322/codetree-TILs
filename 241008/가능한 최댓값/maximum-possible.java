import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[16][16];

        for (int i = 0; i < 16; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            int left = arr[i][0];
            int right = arr[i][1];

            int[][] brr = new int[16][16];
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < 16; k++) {
                    brr[j][k] = dp[j][k];
                }
            }

            for (int l = 0; l < 16; l++) {
                for (int r = 0; r < 16; r++) {
                    if (dp[l][r] == Integer.MIN_VALUE) {
                        continue;
                    }
                    
                    if (l < 15) {
                        brr[l + 1][r] = Math.max(brr[l + 1][r], dp[l][r] + left);
                    }
                    
                    if (r < 15) {
                        brr[l][r + 1] = Math.max(brr[l][r + 1], dp[l][r] + right);
                    }
                }
            }

            dp = brr;
        }

        System.out.println(dp[15][15]);

    }
}