import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                cnt1++;
            }

            if (str.charAt(i) == 'e' && str.charAt(i+1) == 'b') {
                cnt2++;
            }
        }

        System.out.println(cnt1 + " " + cnt2);
    }
}