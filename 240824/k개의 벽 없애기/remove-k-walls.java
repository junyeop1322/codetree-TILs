import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static int[][] arr;

    static int x1, y1, x2, y2;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        x1 = Integer.parseInt(st.nextToken()) - 1;
        y1 = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine(), " ");
        x2 = Integer.parseInt(st.nextToken()) - 1;
        y2 = Integer.parseInt(st.nextToken()) - 1;

        bfs();
    }

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        q.add(new int[] {x1, y1, 0, 0});
        visited[x1][y1] = true;

        while(!q.isEmpty()) {
            int[] a = q.poll();

            int x = a[0];
            int y = a[1];
            int cnt = a[2];
            int wall = a[3];

            if (x == x2 && y == y2) {
                System.out.println(cnt);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (!visited[nx][ny]) {
                        if (arr[nx][ny] == 1) {
                            if (wall < k) {
                                visited[nx][ny] = true;
                                q.add(new int[] {nx, ny, cnt+1, wall+1});
                            }
                        } else {
                            visited[nx][ny] = true;
                            q.add(new int[] {nx, ny, cnt+1, wall});
                        }
                    }
                }
            }
        }

        System.out.println(-1);
    }
}