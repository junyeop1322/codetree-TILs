import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int ans = Integer.MAX_VALUE;
        int cnt = 1;
        while (true) {
            if (cnt > n) {
                break;
            }

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                int num = 0;
                if (i >= cnt) {
                    num = i-cnt;
                } else {
                    num = n+i-cnt;
                }

                sum += arr[i] * num;
            }

            ans = Math.min(sum, ans);
            cnt++;
        }

        System.out.println(ans);

    }
}