import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(checkPalindrome(str));
    }

    static String checkPalindrome(String str) {
        if (str.length() % 2 == 0) {
            for (int i = 0; i <= str.length()/2 -1; i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                    return "No";
                }
            }
        } else {
            for (int i = 0; i <= str.length()/2 -1; i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                    return "No";
                }
            }
        }

        return "Yes";
    }
}