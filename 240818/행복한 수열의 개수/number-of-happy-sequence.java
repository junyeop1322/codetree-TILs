import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += row(i);
            ans += cul(i);
        }

        System.out.println(ans);
    }

    static int row (int num) {
        int cnt = 1;
        int nu = arr[num][0];

        for (int i = 1; i < n; i++) {
            if (arr[num][i] == nu) {
                cnt++;
            } else {
                if (cnt >= m) {
                    return 1;
                } else {
                    nu = arr[num][i];
                    cnt = 1;
                }
            }
        }

        if (cnt >= m) {
            return 1;
        } else {
            return 0;
        }
    }

    static int cul (int num) {
        int cnt = 1;
        int nu = arr[0][num];

        for (int i = 1; i < n; i++) {
            if (arr[i][num] == nu) {
                cnt++;
            } else {
                if (cnt >= m) {
                    return 1;
                } else {
                    nu = arr[i][num];
                    cnt = 1;
                }
            }
        }

        if (cnt >= m) {
            return 1;
        } else {
            return 0;
        }
    }
}