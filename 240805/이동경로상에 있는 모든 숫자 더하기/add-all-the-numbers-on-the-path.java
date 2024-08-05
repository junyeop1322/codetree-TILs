import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int x = n/2;
        int y = n/2;

        int[] dx = {-1, 0, 1, 0}; // 상 우 하 좌
        int[] dy = {0, 1, 0, -1};

        int v = 0;
        int ans = arr[x][y];
        
        for (int i = 0; i < t; i++) {
            char ch = str.charAt(i);

            switch(ch) {
                case 'L':
                    v--;
                    if (v < 0) {
                        v = 3;
                    }
                    break;
                case 'R':
                    v++;
                    if (v > 3) {
                        v = 0;
                    }
                    break;
                case 'F':
                    int nx = x + dx[v];
                    int ny = y + dy[v];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                        x = nx;
                        y = ny;
                        ans += arr[x][y];
                    }
            }
        }

        System.out.println(ans);
    }
}