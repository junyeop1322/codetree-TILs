import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[100];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[j] + arr[k] == 2*i) {
                        cnt++;
                    }
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);

    }
}