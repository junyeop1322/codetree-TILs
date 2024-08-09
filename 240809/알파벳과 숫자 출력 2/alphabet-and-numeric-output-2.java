import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        
        char ch = 'A';
        int cnt = 0;

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n-i)) {
                    sb.append(ch + " ");

                    ch = (char)((int)ch + 1);
                    if (ch > 'Z') {
                        ch = 'A';
                    }
                } else {
                    sb.append(cnt + " ");
                    cnt++;

                    if (cnt == 10) {
                        cnt = 0;
                    }
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}