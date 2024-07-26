import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = br.readLine();

        int cnt = 0;

        if (str.length() == 1) {
            System.out.println(cnt);
            return;
        }

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == s.charAt(0) && str.charAt(i+1) == s.charAt(1)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}