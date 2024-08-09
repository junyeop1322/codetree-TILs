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

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int x = (int)Math.pow(Math.abs(arr[i][0] - arr[j][0]), 2);
                int y = (int)Math.pow(Math.abs(arr[i][1] - arr[j][1]), 2);

                ans = Math.min(ans , (x+y));
            }
        }

        System.out.println(ans);
    }
}