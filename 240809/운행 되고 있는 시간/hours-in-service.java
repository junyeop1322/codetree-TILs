import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, fun(i));
            // System.out.println("ans : " + ans);
        }

        System.out.println(ans);
    }

    static int fun(int num) {
        int[] brr = new int[1001];

        for (int i = 0; i < n; i++) {
            if (i == num) {
                continue;
            }

            int x = arr[i][0];
            int y = arr[i][1];

            for (int j = x; j < y; j++) {
                brr[j]++;
            }
        }

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 1001; i++) {
            if (brr[i] != 0) {
                cnt++;
            } else {
                if (cnt != 0) {
                    sum += cnt;
                    cnt = 0;
                }
            }
        }

        if (cnt != 0) {
            sum += cnt;
        }

        return sum;
    } 
}