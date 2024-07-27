import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb;

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 1) {
                str = str.substring(1, str.length()) + str.substring(0, 1);
                System.out.println(str);
            } else if (num == 2) {
                str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
                System.out.println(str);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                str = sb.reverse().toString();
                System.out.println(str);
            }
        }
    }
}