import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        String str = "";

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            str += st.nextToken();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if ((i+1) % 5 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}