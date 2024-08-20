import java.io.*;
import java.util.*;

public class Main {
    
    static int n, m;
    static int[][] arr;
    static boolean check;

    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    
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

        check = false;
        dfs(0, 0);

        if (check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void dfs(int x, int y) {
        if (check) {
            return;
        }
        
        if (x == n-1 && y == m-1) {
            check = true;
            return;
        }

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < n && ny < m) {
                if (arr[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}