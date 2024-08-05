import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int v = 0;
        
        int[][] arr = new int[n][m];
        int x = 0;
        int y = 0;
        int cnt = 1;

        while(true) {
            arr[x][y] = cnt;
            cnt++;
            if (cnt > n*m) {
                break;
            }

            if ((v == 0 && x == n-1)) {
                v++;
            } else if ((v == 1 && y == m-1)) {
                v++;
            } else if ((v == 2 && x == 0)) {
                v++;
            } else if ((v == 3 && y == 0)) {
                v = 0;
            }

            int nx = x + dx[v];
            int ny = y + dy[v];

            if (arr[nx][ny] != 0) {
                v++;
                if (v > 3) {
                    v = 0;
                }
                nx = x + dx[v];
                ny = y + dy[v];
            }

            x = nx;
            y = ny;

            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}