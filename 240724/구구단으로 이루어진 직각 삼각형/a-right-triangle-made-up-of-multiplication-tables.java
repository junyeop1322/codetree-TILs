import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                sb.append(i + " * " + j + " = " + i*j + " / ");
            }
            sb.delete(sb.length()-2, sb.length());
            sb.append("\n");
        }

        System.out.println(sb);
    }
}