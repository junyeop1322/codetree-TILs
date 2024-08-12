import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;

        for (int i = a; i <= b; i++) {
            ans += func(i);
        }

        System.out.println(ans);
    }

    static int func(int n) {
        String str = Integer.toString(n);
        int cnt = 1;

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                cnt = 0;
                break;
            }
        }

        return cnt;
    }
}