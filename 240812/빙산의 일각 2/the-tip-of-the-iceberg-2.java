import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        int ans = 0;
        for (int i = 0; i <= max; i++) {
            int cnt = 0;
            int ct = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > i) {
                    ct++;
                } else {
                    if (ct > 0) {
                        cnt++;
                        ct = 0;
                    }
                }
            }

            if (ct > 0) {
                cnt++;
            }

            ans = Math.max(ans, cnt);

        }

        System.out.println(ans);
    }
}