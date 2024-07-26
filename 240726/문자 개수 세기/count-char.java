import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "");

        String str = st.nextToken();
        String str2 = br.readLine();
        char ch = str2.charAt(0);

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ch) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}