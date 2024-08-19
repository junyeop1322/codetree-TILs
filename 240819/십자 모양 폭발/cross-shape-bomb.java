import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken()) - 1;

        int num = arr[x][y] - 1;
        arr[x][y] = 0;
        int cnt = 1;
        while(true) {
            if (cnt > num) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + (dx[i] * cnt);
                int ny = y + (dy[i] * cnt);

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    arr[nx][ny] = 0;
                }
            }

            cnt++;
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int k = i; k >= 0; k--) {
                        if (arr[k][j] != 0) {
                            for (int l = i; l >= 0; l--) {
                                if (arr[l][j] == 0) {
                                    arr[l][j] = arr[k][j];
                                    arr[k][j] = 0;

                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}