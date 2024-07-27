import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                str = str.substring(1, str.length()) + str.substring(0, 1);
            } else {
                str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
            }
        }

        System.out.println(str);
    }
}