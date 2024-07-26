import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;

        String str = st.nextToken();

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;

                sb = new StringBuilder();

                sb.append(str);
                char ch = str.charAt(a);

                sb.setCharAt(a, str.charAt(b));
                sb.setCharAt(b, ch);

                str = sb.toString();

                System.out.println(str);
            } else {
                char a = st.nextToken().charAt(0);
                char b = st.nextToken().charAt(0);

                str = str.replace(a, b);
                System.out.println(str);
            }
        }
    }
}