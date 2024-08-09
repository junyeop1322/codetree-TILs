import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = Math.max(fun(arr, price, n, i), ans);
        }

        System.out.println(ans);

    }

    static int fun(int[] arr, int price, int n, int idx) {
        int cnt = 0;
        int p = price;

        for (int i = 0; i < n; i++) {
            if (p < 0) {
                break;
            }

            if (i == idx) {
                p -= arr[i]/2;
            } else {
                p -= arr[i];
            }

            if (p >= 0) {
                // System.out.println("arr[i] : " + arr[i] + ", p : " + p);
                cnt++;
            }
        }

        return cnt;
    }
}