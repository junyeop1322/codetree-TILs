import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max += i;
        }

        int cnt = 0;
        int v = 0;
        int num = 0;

        int x = 0;
        int y = 0;

        while(true) {
            arr[x][y] = num;
            visited[x][y] = true;
            
            if (v == 0) {
                if (x == n-1 && y == n-1) {
                    v = 1;
                    y--;
                } else if (visited[x+1][y+1]) {
                    v = 1;
                    y--;
                } else {
                    x++;
                    y++;
                }
            } else if (v == 1) {
                if (y == 0) {
                    v = 2;
                    x--;
                } else if (visited[x][y-1]) {
                    v = 2;
                    x--;
                } else {
                    y--;
                }
            } else if (v == 2) {
                if (visited[x-1][y]) {
                    v = 0;
                    x++;
                    y++;
                } else {
                    x--;
                }
            }

            num++;
            if (num > 9) {
                num = 0;
            }
            cnt++;

            if (cnt >= max) {
                break;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}