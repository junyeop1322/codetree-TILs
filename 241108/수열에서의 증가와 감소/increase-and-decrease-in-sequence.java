import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];

        int max = 1;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp1[i] = 1;
            dp2[i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] > arr[i-1]) {
                dp1[i] = dp1[i-1] + 1;
            } else if (arr[i] < arr[i-1]) {
                dp2[i] = dp2[i-1] + 1;
            }

            max = Math.max(max, Math.max(dp1[i], dp2[i]));
        }

        System.out.println(max);
    }
}