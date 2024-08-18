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
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <=  n - 3; j++) {
                ans = Math.max(ans, coin(i, j));
            }
        }

        System.out.println(ans);
    }

    static int coin(int x, int y) {
        int cnt = 0;

        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}