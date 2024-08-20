import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        int max = 0;
        int min = 101;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                max = Math.max(max, num);
                min = Math.min(min, num);

                arr[i][j] = num;
            }
        }

        int ans1 = 0;
        int ans2 = 0;
        
        for (int k = min; k <= max; k++) {
            int cnt = 0;
            visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] <= k && !visited[i][j]) {
                        dfs(i, j, k);
                        cnt++;
                    }
                }
            }

            if (cnt >= ans1) {
                ans1 = cnt;
                ans2 = k;
            }
        }

        System.out.println(ans2 + " " + ans1);
    }

    static void dfs(int x, int y, int num) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (arr[nx][ny] <= num && !visited[nx][ny]) {
                    dfs(nx, ny, num);
                }
            }
        }

    }
}