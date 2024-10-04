import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] brr = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
            brr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        int cur = brr[n-1];
        int num1 = brr[n-1];
        int num2 = 0;

        for (int i = n-2; i >= 0; i--) {
            num2 = brr[i];

            if (num1 < num2) {
                continue;
            }

            if (num2 <= cur) {
                cnt++;
                cur = brr[i];
            }
        }

        System.out.println(cnt);

    }
}