import java.util.*;
import java.io.*;

public class Main {

    static int n, m;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    ans = Math.max(ans, bfs(arr, i, j));
                    arr[i][j] = 0;
                }
            }
        }

        if (ans == 0) {
            ans = n*m;
        }

        System.out.println(ans);
    }

    static int bfs(int[][] arr, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int cnt = 1;

        visited[x][y] = true;
        q.add(new int[] {x, y});
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int sx = cur[0];
            int sy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = sx + dx[i];
                int ny = sy + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    cnt++;
                    visited[nx][ny] = true;
                    q.add(new int[] {nx, ny});
                }
            }
        }

        return cnt;
    }
}