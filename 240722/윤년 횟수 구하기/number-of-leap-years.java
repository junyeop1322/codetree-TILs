import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0 && i % 400 != 0) {
                    continue;
                }

                cnt++;
            }
        }

        System.out.println(cnt);
    }
}