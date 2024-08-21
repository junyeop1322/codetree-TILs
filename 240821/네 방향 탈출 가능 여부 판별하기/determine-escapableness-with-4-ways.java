import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();

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

        bfs();


    }

    static void bfs() {
        q.add(new int[] {0, 0});
        visited[0][0] = true;

        while(!q.isEmpty()) {
            int[] a = q.poll();
            int x = a[0];
            int y = a[1];

            if (x == n-1 && y == m-1) {
                System.out.println(1);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                        q.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }


        }

        System.out.println(0);
    }
}