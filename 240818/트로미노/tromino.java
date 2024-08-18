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

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, row(i));
        }
        
        for (int j = 0; j < m; j++) {
            ans = Math.max(ans, cul(j));
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, func(i, j));
            }
        }

        System.out.println(ans);
    }

    static int func(int x, int y) {
        int sum = 0;
        int nx1;
        int ny1;
        int nx2;
        int ny2;

        // case 1
        nx1 = x+1;
        ny1 = y;
        nx2 = x;
        ny2 = y+1;

        if (nx1 < n && ny2 < m) {
            sum = Math.max(sum, (arr[x][y] + arr[nx1][ny1] + arr[nx2][ny2]));
        }

        // case 2
        nx1 = x+1;
        ny1 = y;
        nx2 = x;
        ny2 = y-1;

        if (nx1 < n && ny2 >= 0) {
            sum = Math.max(sum, (arr[x][y] + arr[nx1][ny1] + arr[nx2][ny2]));
        }

        // case 3
        nx1 = x-1;
        ny1 = y;
        nx2 = x;
        ny2 = y+1;

        if (nx1 >= 0 && ny2 < m) {
            sum = Math.max(sum, (arr[x][y] + arr[nx1][ny1] + arr[nx2][ny2]));
        }

        // case 4
        nx1 = x-1;
        ny1 = y;
        nx2 = x;
        ny2 = y-1;

        if (nx1 >= 0 && ny2 >= 0) {
            sum = Math.max(sum, (arr[x][y] + arr[nx1][ny1] + arr[nx2][ny2]));
        }


        return sum;
    }

    static int row (int num) {
        int sum = 0;

        for (int i = 0; i <= m-3; i++) {
            int s = 0;

            for (int j = i; j < i+3; j++) {
                s += arr[num][j];
            }

            sum = Math.max(sum, s);
        }

        return sum;
    }

    static int cul (int num) {
        int sum = 0;

        for (int i = 0; i <= n-3; i++) {
            int s = 0;

            for (int j = i; j < i+3; j++) {
                s += arr[j][num];
            }

            sum = Math.max(sum, s);
        }

        return sum;
    }
}