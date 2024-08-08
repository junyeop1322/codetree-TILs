import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for (int i = 0; i <= 100; i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j][1] >= i - k && arr[j][1] <= i + k) {
                    sum += arr[j][0];
                }
            }

            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}