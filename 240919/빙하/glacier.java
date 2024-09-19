import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] ice;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

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

        int cnt = 0;
        int ans = 0;

        while(true) {
            if (count() == 0) {
                break;
            } else {
                ans = count();
            }
            cnt++;

            bfs();
        }

        System.out.println(cnt + " " + ans);

    }

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});

        visited = new boolean[n][m];
        ice = new int[n][m];

        while(!q.isEmpty()) {
            int[] a = q.poll();

            int x = a[0];
            int y = a[1];
            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (arr[nx][ny] == 0 && !visited[nx][ny]) {
                        q.add(new int[]{nx, ny});
                    } else {
                        ice[nx][ny] = 1;
                    }
                }
            }
        }

        check(ice);

    }

    static void check(int[][] ice) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ice[i][j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    static int count() {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}