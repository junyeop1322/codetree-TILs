import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            int num = Integer.parseInt(br.readLine());

            int cnt = 0;

            while(true) {
                if (num == 1) {
                    break;
                }

                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                cnt++;
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
}