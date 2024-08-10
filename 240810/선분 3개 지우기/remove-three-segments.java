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

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    ans += func(i, j, k);
                }
            }
        }

        System.out.println(ans);
    }

    static int func(int a, int b, int c) {
        int[] brr = new int[101];

        for (int i = 0; i < n; i++) {
            if (i != a && i != b && i != c) {
                int x = arr[i][0];
                int y = arr[i][1];

                for (int j = x; j <= y; j++) {
                    brr[j]++;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            if (brr[i] > 1) {
                return 0;
            }
        }

        return 1;
    }
}