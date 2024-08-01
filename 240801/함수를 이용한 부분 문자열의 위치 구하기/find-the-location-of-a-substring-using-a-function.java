import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = br.readLine();

        System.out.println(findString(str, s));
    }

    static int findString(String str, String s) {
        int num = -1;

        for (int i = 0; i <= str.length() - s.length(); i++) {
            if (str.charAt(i) == s.charAt(0)) {
                boolean check = true;

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != str.charAt(i+j)) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    num = i;
                    break;
                }
            }
        }

        return num;
    }
}