import java.io.*;
import java.util.*;

public class Main {

    static int n, h, m;
    static int[][] arr;
    static int[][] ans;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 2) {
                    bfs(i, j);
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 2 && ans[i][j] == 0) {
                    ans[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void bfs(int x, int y) {
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[] {x, y, 0});
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int[] a = q.poll();
            int sx = a[0];
            int sy = a[1];
            int cnt = a[2];

            if (arr[sx][sy] == 3) {
                ans[x][y] = cnt;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = sx + dx[i];
                int ny = sy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (arr[nx][ny] != 1 && !visited[nx][ny]) {
                        q.add(new int[] {nx, ny, cnt+1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}