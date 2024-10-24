import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        String key = st.nextToken();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.contains(key)) {
                System.out.println(str);
            }
        }
    }
}