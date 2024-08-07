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

        int ans = Integer.MAX_VALUE;

        int cnt = 1;
        while (true) {
            if (cnt == n-1) {
                break;
            }
            int sum = 0;
            int x = arr[0][0];
            int y = arr[0][1];

            for (int i = 1; i < cnt; i++) {
                sum += Math.abs(x - arr[i][0]) + Math.abs(y - arr[i][1]);
                x = arr[i][0];
                y = arr[i][1];
            }

            for (int i = cnt+1; i < n; i++) {
                sum += Math.abs(x - arr[i][0]) + Math.abs(y - arr[i][1]);
                x = arr[i][0];
                y = arr[i][1];
            }

            ans = Math.min(ans, sum);
            cnt++;
        }

        System.out.println(ans);

    }
}