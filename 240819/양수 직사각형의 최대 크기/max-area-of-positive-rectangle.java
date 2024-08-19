import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ans = -1;

        func(1, 1);

        System.out.println(ans);
    }

    static void func(int x, int y) {
        if (x == n + 1 || y == m + 1) {
            return;
        }

        boolean check = false;

        for (int i = 0; i <= n - x; i++) {
            for (int j = 0; j <= m - y; j++) {
                check = true;
                for (int k = i; k < i + x; k++) {
                    for (int l = j; l < j + y; l++) {
                        if (arr[k][l] < 0) {
                            check = false;
                        }
                    }
                }

                if (check) {
                    // System.out.println("x : " + x + ", y : " + y + ", ans = " + x*y);
                    ans = Math.max(ans, x * y);
                }
            }

        }


        func(x+1, y);
        func(x, y+1);
    }
}