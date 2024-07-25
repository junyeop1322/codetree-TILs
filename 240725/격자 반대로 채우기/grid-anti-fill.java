import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][n+1];
        int x = n;
        int y = n;

        int cnt = 1;

        while (cnt <= n*n) {
            arr[x][y] = cnt;
            if (n % 2 == 0) {
                if (y % 2 == 0) {
                    x--;
                    if (x == 0) {
                        x = 1;
                        y--;
                    }
                } else {
                    x++;
                    if (x > n) {
                        x = n;
                        y--;
                    }
                }
            } else {
                if (y % 2 == 1) {
                    x--;
                    if (x == 0) {
                        x = 1;
                        y--;
                    }
                } else {
                    x++;
                    if (x > n) {
                        x = n;
                        y--;
                    }
                }
            }
            cnt++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}