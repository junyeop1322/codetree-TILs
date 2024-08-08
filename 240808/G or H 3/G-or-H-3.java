import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[10001];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);

            if (ch == 'G') {
                arr[num] += 1;
            } else {
                arr[num] += 2;
            }
        }

        int ans = 0;
        for (int i = 1; i < 10001-k; i++) {
            int sum = 0;
            for (int j = i; j <= i+k; j++) {
                sum += arr[j];
            }

            ans = Math.max(sum, ans);
        }

        System.out.println(ans);
    }
}