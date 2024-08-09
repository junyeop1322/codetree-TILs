import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        int cnt = 1;
        int v = 0;
        int x = 0;
        int y = 0;

        while(cnt <= (int)Math.pow(n, 2)) {
            arr[x][y] = cnt;

            if (v == 0) {
                if (y+1 == n) {
                    x++;
                    v = 1;
                } else {
                    if (arr[x][y+1] != 0) {
                        x++;
                        v = 1;
                    } else {
                        y++;
                    }
                }
            } else if (v == 1) {
                if (x+1 == n) {
                    y--;
                    v = 2;
                } else {
                    if (arr[x+1][y] != 0) {
                        y--;
                        v = 2;
                    } else {
                        x++;
                    }
                }
            } else if (v == 2) {
                if (y == 0) {
                    x--;
                    v = 3;
                } else {
                    if (arr[x][y-1] != 0) {
                        x--;
                        v = 3;
                    } else {
                        y--;
                    }
                }
            } else if (v == 3) {
                if (x == 0) {
                    y++;
                    v = 0;
                } else {
                    if (arr[x-1][y] != 0) {
                        y++;
                        v = 0;
                    } else {
                        x--;
                    }
                }
            }

            cnt++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}