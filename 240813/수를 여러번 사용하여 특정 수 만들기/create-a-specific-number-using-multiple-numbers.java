import java.io.*;
import java.util.*;

public class Main {

    static int ans, c;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        ans = 0;

        func(a, b, 0, 0);

        System.out.println(ans);
    }

    static void func(int a, int b, int ct1, int ct2) {
        int num = (a * ct1) + (b * ct2);

        if (num > c) {
            return;
        } else {
            ans = Math.max(ans, num);

            func(a, b, ct1+1, ct2);
            func(a, b, ct1, ct2+1);
        }
    }
}