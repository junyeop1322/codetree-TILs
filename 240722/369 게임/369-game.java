import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sb.append(0 + " ");
            } else if (check(i)) {
                sb.append(0 + " ");
            } else {
                sb.append(i + " ");
            }
        }

        System.out.println(sb);
    }

    static boolean check(int n) {

        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '3' || ch == '6' || ch == '9') {
                return true;
            }
        }

        return false;
    }
}