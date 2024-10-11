import java.io.*;
import java.util.*;

public class Main {

    static int n, m, h, w;

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
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        int sr = Integer.parseInt(st.nextToken())-1;
        int sc = Integer.parseInt(st.nextToken())-1;
        int nr = Integer.parseInt(st.nextToken())-1;
        int nc = Integer.parseInt(st.nextToken())-1;

        bfs(sr, sc, nr, nc);
    }

    static void bfs(int sr, int sc, int nr, int nc) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {sr, sc, 0});

        visited[sr][sc] = true;

        while(!q.isEmpty()) {
            int[] que = q.poll();
            int x = que[0];
            int y = que[1];
            int cnt = que[2];

            if (x == nr && y == nc) {
                System.out.println(cnt);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (check(nx, ny) && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[] {nx, ny, cnt+1});
                    }
                }
            }
        }


        System.out.println(-1);
    }

    static boolean check(int r, int c) {
        for (int i = r; i < r+h; i++) {
            for (int j = c; j < c+w; j++) {
                if (i >= n || j >= m) {
                    return false;
                }

                if (arr[i][j] == 1) {
                    return false;
                }
            }
        }

        return true;
    }
}