import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt3 = 0;
        int cnt5 = 0;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());

            if (num % 3 == 0) {
                cnt3++;
            }

            if (num % 5 == 0) {
                cnt5++;
            }
        }

        System.out.println(cnt3 + " " + cnt5);
    }
}