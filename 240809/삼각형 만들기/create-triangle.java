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
                    if (check(i, j, k)) {
                        ans = Math.max(ans, fun(i, j, k));
                    }
                }
            }
        }

        System.out.println(ans);

    }

    static boolean check(int i, int j, int k) {
        boolean chk1 = false;
        boolean chk2 = false;

        for (int t = 0; t < n-1; t++) {
            for (int o = t+1; o < n; o++) {
                if (t == i || t == j || t == k) {
                    if (o == i || o == j || o == k) {
                        if (arr[t][0] == arr[o][0]) {
                            chk1 = true;
                        }

                        if (arr[t][1] == arr[o][1]) {
                            chk2 = true;
                        }
                    }
                }
            }
        }

        if (chk1 && chk2) {
            return true;
        } else {
            return false;
        }
    }

    static int fun(int i, int j, int k) {
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;

        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;

        for (int t = 0; t < n; t++) {
            if (t == i || t == j || t == k) {
                x1 = Math.min(x1, arr[t][0]);
                y1 = Math.min(y1, arr[t][1]);

                x2 = Math.max(x2, arr[t][0]);
                y2 = Math.max(y2, arr[t][1]);
            }
        }

        int sum = (x2 - x1) * (y2 - y1);

        return sum;
    }
}