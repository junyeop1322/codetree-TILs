import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][m+1];

        int cnt = 0;

        int x = 1;
        int y = 1;

        while (true) {
            if (y % 2 == 1) {
                arr[x][y] = cnt;
                cnt++; 
                if (x == n) {
                    y++;
                } else {
                    x++;
                }
            } else {
                arr[x][y] = cnt;
                cnt++;
                if (x == 1) {
                    y++;
                } else {
                    x--;
                }
            }
            
            if (y > m) {
                break;
            }
            
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}