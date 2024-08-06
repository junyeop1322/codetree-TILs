import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        int cnt = n*n;

        int x = 0;
        int y = 0;
        int v = 0;

        while (cnt != 0) {
            arr[x][y] = cnt;

            if (v == 0) {
                if (x != n-1) {
                    if (arr[x+1][y] != 0) {
                        v = 1;
                        y++;
                    } else {
                        x++;
                    }
                } else {
                    v = 1;
                    y++;
                }
            } else if (v == 1) {
                if (y != n-1) {
                    if (arr[x][y+1] != 0) {
                        v = 2;
                        x--;
                    } else {
                        y++;
                    }
                } else {
                    v = 2;
                    x--;
                }
            } else if (v == 2) {
                if (x != 0) {
                    if (arr[x-1][y] != 0) {
                        v = 3;
                        y--;
                    } else {
                        x--;
                    }
                } else {
                    v = 3;
                    y--;
                }
            } else if (v == 3){
                if (y != 0) {
                    if (arr[x][y-1] != 0) {
                        v = 0;
                        x++;
                    } else {
                        y--;
                    }
                } else {
                    y--;
                }
            }

            cnt--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == num) {
                    x = i;
                    y = j;
                }
            }
            System.out.println();
        }

        System.out.println((x+1) + " " + (y+1));
    }
}