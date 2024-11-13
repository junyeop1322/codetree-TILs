import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int ans = 0;

        for (int i = 1; i < n; i++) {
            if (check(i, n)) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }

    static boolean check(int num, int n) {
        String str = Integer.toString(num);

        int sum = num;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}