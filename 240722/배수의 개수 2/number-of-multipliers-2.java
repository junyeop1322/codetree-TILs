import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}