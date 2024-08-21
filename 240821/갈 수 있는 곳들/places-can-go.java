import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int t = 0; t < k; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            if (!visited[x][y]) {
                ans += bfs(x, y);
            }
        }

        System.out.println(ans);
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[x][y] = true;

        int cnt = 1;

        while(!q.isEmpty()) {
            int[] a = q.poll();
            int sx = a[0];
            int sy = a[1];

            for (int i = 0; i < 4; i++) {
                int nx = sx + dx[i];
                int ny = sy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (!visited[nx][ny] && arr[nx][ny] == 0) {
                        q.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
}