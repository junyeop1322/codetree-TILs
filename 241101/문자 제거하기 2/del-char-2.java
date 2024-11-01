import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(br.readLine());

            if (cnt > str.length()) {
                continue;
            }

            str = str.substring(0, cnt-1) + str.substring(cnt, str.length());

            System.out.println(str);
        }
    }
}