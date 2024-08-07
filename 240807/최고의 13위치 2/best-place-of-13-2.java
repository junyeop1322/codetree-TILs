import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (i == k) {
                    if (n >= 6) {
                        for (int j = 0; j <= n - 6; j++) {
                            for (int l = j+3; l <= n - 3; l++) {
                                max = Math.max(max, coin(i,j)+coin(k,l));
                            }
                        }
                    }
                } else {
                    for (int j = 0; j <= n - 3; j++) {
                        for (int l = 0; l <= n - 3; l++) {
                            max = Math.max(max, coin(i,j)+coin(k,l));
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }

    static int coin(int x, int y) {
        int sum = 0;

        sum += arr[x][y];
        sum += arr[x][y+1];
        sum += arr[x][y+2];

        return sum;
    }
}