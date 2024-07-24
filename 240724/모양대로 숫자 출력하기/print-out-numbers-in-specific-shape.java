import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n-i; j++) {
                sb.append("  ");
            }
            for (int j = i; j >= 1; j--) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}