import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int v = 0;
        
        char[][] arr = new char[n][m];
        int x = 0;
        int y = 0;
        char cnt = 'A';
        int c = 1;

        while(true) {
            arr[x][y] = cnt;
            c++;
            cnt = (char)(cnt + 1);
            if (cnt > 'Z') {
                cnt = 'A';
            }
            if (c > n*m) {
                break;
            }

            if ((v == 0 && y == m-1)) {
                v++;
            } else if ((v == 1 && x == n-1)) {
                v++;
            } else if ((v == 2 && y == 0)) {
                v++;
            } else if ((v == 3 && x == 0)) {
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