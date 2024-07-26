import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        StringBuilder sb = new StringBuilder();

        sb.append(str2);

        sb.setCharAt(0, str1.charAt(0));
        sb.setCharAt(1, str1.charAt(1));

        System.out.println(sb);
    }
}