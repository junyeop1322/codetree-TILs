import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int min = Math.min(Math.min(a, b), c);

        int ans1;
        int ans2;

        if (a == min) {
            ans1 = 1;
        } else {
            ans1 = 0;
        }

        if (a == b && b == c) {
            ans2 = 1;
        } else {
            ans2 = 0;
        }

        System.out.println(ans1 + " " + ans2);
    }
}