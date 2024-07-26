import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb;

        int sum = 0;

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '1' && str1.charAt(i) <= '9') {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }

        sum += Integer.parseInt(sb.toString());

        sb = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '1' && str2.charAt(i) <= '9') {
                sb.append(str2.charAt(i));
            } else {
                break;
            }
        }

        sum += Integer.parseInt(sb.toString());

        System.out.println(sum);
    }
}