import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static Character[][] arr;
    static boolean[][] visited1;
    static boolean[][] visited2;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        arr = new Character[n][n];
        visited1 = new boolean[n][n];
        visited2 = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = st.charAt(j);
            }
        }

        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited1[i][j]) {
                    ans1++;
                    visited1[i][j] = true;
                    dfs(i, j);
                }

                if (!visited2[i][j]) {
                    ans2++;
                    visited2[i][j] = true;
                    bfs(i, j);
                }
            }
        }

        System.out.println(ans1 + " " + ans2);
    }

    static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (!visited1[nx][ny] && arr[x][y] == arr[nx][ny]) {
                visited1[nx][ny] = true;
                dfs(nx, ny);
            }
        }

    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int sx = cur[0];
            int sy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = sx + dx[i];
                int ny = sy + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (!visited2[nx][ny]) {
                    if (arr[sx][sy] == 'B') {
                        if (arr[nx][ny] == 'B') {
                            visited2[nx][ny] = true;
                            q.add(new int[] {nx, ny});
                        }
                    } else {
                        if (arr[nx][ny] != 'B') {
                            visited2[nx][ny] = true;
                            q.add(new int[] {nx, ny});
                        }
                    }
                }
            }
        }
    }
}