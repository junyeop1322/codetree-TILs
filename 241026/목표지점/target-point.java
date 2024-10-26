import java.util.*;
import java.io.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] ans;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];
        ans = new int[n][m];

        int sx = 0;
        int sy = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    sx = i;
                    sy = j;
                }
            }
        }

        bfs(sx, sy);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        visited[sx][sy] = true;
        q.add(new int[] {sx, sy, 0});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    ans[nx][ny] = cnt+1;
                    q.add(new int[] {nx, ny, cnt+1});
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    ans[i][j] = -1;
                }
            }
        }
    }
}