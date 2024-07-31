import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        char[][] ans = new char[n*k][m*k];

        int idx = 0;

        for (int i = 0; i < n; i++) {
            for (int o = 0; o < k; o++) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    for (int p = 0; p < k; p++) {
                        ans[idx][cnt] = map[i][j];
                        cnt++;
                    }
                }
                idx++;
            }
        }

        for (int i = 0; i < n*k; i++) {
            for (int j = 0; j < m*k; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}