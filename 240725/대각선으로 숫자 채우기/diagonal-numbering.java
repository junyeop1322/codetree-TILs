import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int cnt = 1;

        int x = 0;
        int y = 0;

        int sx = 0;
        int sy = 0;

        while (cnt <= n*m) {
            arr[x][y] = cnt;

            x++;
            y--;

            if (x >= n || y < 0) {
                if (sy == m-1) {
                    sx++;
                } else {
                    sy++;
                }

                x = sx;
                y = sy;
            }

            cnt++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}