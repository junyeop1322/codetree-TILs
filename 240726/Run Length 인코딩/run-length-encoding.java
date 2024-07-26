import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char ch = str.charAt(0);
        int cnt = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);

            if (ch == c) {
                cnt++;
            } else {
                sb.append(cnt);
                ch = c;
                sb.append(c);
                cnt = 1;
            }
        }

        if (cnt != 1) {
            sb.append(cnt);
        }

        System.out.println(sb.length());
        System.out.println(sb);
    }
}