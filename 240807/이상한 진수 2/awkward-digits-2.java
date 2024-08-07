import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int n = -1;
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                n = i;
                break;
            }
        }

        if (n == -1) {
            ans = Integer.parseInt(str, 2) - 1;
        } else {
            String str1 = "";

            for (int i = 0; i < n; i++) {
                str1 += str.charAt(i);
            }
            str1 += "1";
            for (int i = n+1; i < str.length(); i++) {
                str1 += str.charAt(i);
            }

            ans = Integer.parseInt(str1, 2);
        }

        System.out.println(ans);

    }
}