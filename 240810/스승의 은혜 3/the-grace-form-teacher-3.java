import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            int sum1 = o1[0]+o1[1];
            int sum2 = o2[0]+o2[1];

            if (sum1 == sum2) {
                return o1[0] - o2[0];
            } else {
                return sum1 - sum2;
            }
        });

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int price = p;
            for (int j = 0; j < n; j++) {
                if (price < 0) {
                    cnt = j;
                    break;
                }
                int p1 = arr[j][0];
                int p2 = arr[j][1];
                if (i == j) {
                    p1 /= 2;
                }

                price = price - (p1 + p2);
            }

            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);

    }
}