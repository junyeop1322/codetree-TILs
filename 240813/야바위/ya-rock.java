import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int i = 1; i <= 3; i++) {
            int[] brr = new int[4];
            brr[i] = 1;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                int a = arr[j][0];
                int b = arr[j][1];
                int c = arr[j][2];

                int temp = brr[a];
                brr[a] = brr[b];
                brr[b] = temp;

                cnt += brr[c];
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}