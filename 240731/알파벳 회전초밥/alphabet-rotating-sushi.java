import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String s = br.readLine();
        int cnt = 1;

        int idx1 = 0;
        int idx2 = 0;

        while (idx2 != s.length()) {
            if (idx1 == str.length()) {
                cnt++;
                idx1 = 0;
            }

            if (str.charAt(idx1) == s.charAt(idx2)) {
                idx2++;
            }

            idx1++;
        }

        System.out.println(cnt);
    }
}