import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y]++;
            arr[y][x]++;
        }

        dfs(1);

        int cnt = -1;
        for (int i = 0; i <= n; i++) {
            if (visited[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void dfs(int num) {
        visited[num] = true;

        for (int i = 0; i <= n; i++) {
            if (arr[num][i] != 0 && !visited[i]) {
                dfs(i);
            }
        }
    }
}