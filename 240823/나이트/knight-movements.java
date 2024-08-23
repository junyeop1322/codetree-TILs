import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static boolean[][] arr;
    static int x1, y1;
    static int x2, y2;

    static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        arr = new boolean[n][n];

        st = new StringTokenizer(br.readLine(), " ");
        x1 = Integer.parseInt(st.nextToken()) - 1;
        y1 = Integer.parseInt(st.nextToken()) - 1;

        x2 = Integer.parseInt(st.nextToken()) - 1;
        y2 = Integer.parseInt(st.nextToken()) - 1;

        bfs();
    }

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x1, y1, 0});
        arr[x1][y1] = true;

        while (!q.isEmpty()) {
            int[] a = q.poll();
            int x = a[0];
            int y = a[1];
            int cnt = a[2];

            if (x == x2 && y == y2) {
                System.out.println(cnt);
                return;
            }

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (!arr[nx][ny]) {
                        q.add(new int[] {nx, ny, cnt+1});
                        arr[nx][ny] = true;
                    }
                }
            }
        }

        System.out.println(-1);
    }
}