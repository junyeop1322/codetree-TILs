import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double sum = 0;
        double cnt = 0;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num >= 0 && num <= 200) {
                sum += num;
                cnt++;
            }
        }

        System.out.printf("%.0f %.1f", sum, sum/cnt);
    }
}