import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals(str)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}