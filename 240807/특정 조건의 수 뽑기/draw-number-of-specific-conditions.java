import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        int ans1 = 0;
        int ans2 = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num >= 100) {
                ans2 = Math.min(ans2, num);
            }

            if (Math.abs(num-100) < min) {
                min = Math.abs(num-100);
                ans1 = num;
            }
        }

        System.out.println(ans1 + " " + ans2);
    }
}