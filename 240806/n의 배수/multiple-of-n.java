import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        int cnt = 1;

        while (true) {
            if (n * cnt > 200) {
                break;
            }

            sb.append(n*cnt + " ");

            if ((n * cnt) % 10 == 0) {
                break;
            }

            cnt++;
        }

        System.out.println(sb);
    }
}