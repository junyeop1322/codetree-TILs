import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {-1, -1, 0, 0, 1, 1};
    static int[] dy = {0, 1, -1, 1, 0, 1};

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

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    ans += bfs(i, j);
                }
            }
        }

        System.out.println(ans);
    }

    static int bfs(int x, int y) {
        visited[x][y] = true;
        int cnt = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while(!q.isEmpty()) {
            int[] a = q.poll();
            int sx = a[0];
            int sy = a[1];

            for (int i = 0; i < 6; i++) {
                int nx = sx + dx[i];
                int ny = sy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[] {nx, ny});
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}