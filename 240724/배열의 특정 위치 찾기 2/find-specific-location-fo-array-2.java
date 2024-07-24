import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i % 2 == 0) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }

        int max = Math.max(sum1, sum2);
        int min = Math.min(sum1, sum2);

        System.out.println(max-min);
    }
}