import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(check(str));
    }

    static String check(String str) {
        boolean chk = false;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                chk = true;
                break;
            }
        }

        if (chk) {
            return "Yes";
        } else {
            return "No";
        }
    }
}