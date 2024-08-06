import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        if (n == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}