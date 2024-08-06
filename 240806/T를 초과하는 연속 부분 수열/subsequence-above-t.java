import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int cnt = 1;
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n-1; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (num > t && number > t && num < number) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }

            num = number;
        }

        System.out.println(max);
    }
}