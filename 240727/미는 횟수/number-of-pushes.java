import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int cnt = 1;

        while (true) {
            if (cnt > str1.length()) {
                System.out.println(-1);
                break;
            }

            str1 = str1.substring(str1.length()-1, str1.length()) + str1.substring(0, str1.length()-1);

            if (str2.equals(str1)) {
                System.out.println(cnt);
                break;
            }

            cnt++;
        }
    }
}