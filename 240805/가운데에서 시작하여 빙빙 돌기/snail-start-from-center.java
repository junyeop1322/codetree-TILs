import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        int[] dx = {0, -1, 0, 1}; // 좌상우하
        int[] dy = {-1, 0, 1, 0};

        int cnt = n*n;

        int x = n-1;
        int y = n-1;
        int v = 0;

        while(true) {
            arr[x][y] = cnt;
            cnt--;

            if (cnt == 0) {
                break;
            }

            int nx = x + dx[v];
            int ny = y + dy[v];

            if (v == 0 && y == 0) {
                v++;
            } else if (v == 1 && x == 0) {
                v++;
            } else if (v == 2 && y == n-1) {
                v++;
            } else if (v == 3 && x == n-1) {
                v = 0;
            }

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (arr[nx][ny] != 0) {
                    v++;
                    if (v > 3) {
                        v = 0;
                    }
                }
            }

            nx = x + dx[v];
            ny = y + dy[v];

            x = nx;
            y = ny;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}