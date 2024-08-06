import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = 1;
        int cnt = 1;
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < n-1; i++) {
            int number = Integer.parseInt(br.readLine());

            if (num > 0) {
                if (number > 0) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                    num = number;
                }
            } else {
                if (number < 0) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                    num = number;
                }
            }
        }

        max = Math.max(max, cnt);

        System.out.println(max);
    }
}