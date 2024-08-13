import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, func(arr, i));
        }

        System.out.println(ans);
    }

    static int func(int[] arr, int num) {
        int ans = Integer.MAX_VALUE;
        int[] brr = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == num) {
                brr[i] = arr[i]*2;
            } else {
                brr[i] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < n-1; j++) {
                if (i == j) {
                    continue;
                }

                int a = brr[j];
                int b = brr[j+1];
                if (j+1 == i) {
                    if (i == n-1) {
                        continue;
                    } else {
                        b = brr[j+2];
                    }
                }

                sum += Math.abs(a-b);
            }

            ans = Math.min(ans, sum);
        }


        return ans;
    }
}