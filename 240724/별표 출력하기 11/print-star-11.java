import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        if (n == 1) {
            m = 3;
        } else {
            m = (2*n) + 1;
        }

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    sb.append("* ");
                }
            } else {
                for (int j = 0; j < m; j++) {
                    if (j % 2 == 0) {
                        sb.append("* ");
                    } else {
                        sb.append("  ");
                    }
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}