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
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int ans = -1;

        for (int i = 0; i < n; i++) {
            int cnt = fun(arr, i, k);

            if (cnt != 1) {
                    ans = Math.max(ans, arr[i]);
            }
        }

        System.out.println(ans);
    }

    static int fun(int[] arr, int n, int k) {
        int cnt = 0;
        // System.out.println("----------- n : " + n);

        int num = arr[n];

        for (int i = 0; i < arr.length; i++) {
            if (i >= n-k && i <= n+k && arr[i] == num) {
                // System.out.println("arr[i] : " + arr[i]);
                cnt++;
            }
        }

        return cnt;
    }
}