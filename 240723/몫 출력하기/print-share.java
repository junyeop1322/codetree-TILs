import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        while(true) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 0) {
                sb.append(num/2 + "\n");
                cnt++;
            } else {
                continue;
            }

            if (cnt == 3) {
                break;
            }
        }

        System.out.println(sb);
    }
}