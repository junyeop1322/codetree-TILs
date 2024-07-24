import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1) {
                    arr[i][j] = 1;
                } else if (j < i) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= n; j++) {
                if (arr[i][j] == 1) {
                    sb.append("* ");
                } else {
                    sb.append("  ");
                }
            }
        }

        System.out.println(sb);
    }
}