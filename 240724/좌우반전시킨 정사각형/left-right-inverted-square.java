import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}