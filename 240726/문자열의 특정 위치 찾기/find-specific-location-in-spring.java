import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str = st.nextToken();
        String s = st.nextToken();
        char ch = s.charAt(0);

        int num = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                num = i;
                break;
            }
        }

        if (num == -1) {
            System.out.println("No");
        } else {
            System.out.println(num);
        }
    }
}