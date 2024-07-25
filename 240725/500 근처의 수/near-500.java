import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = 1000;
        int min = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num > 500) {
                max = Math.min(max, num);
            } else {
                min = Math.max(min, num);
            }
        }

        System.out.println(min + " " + max);
    }
}