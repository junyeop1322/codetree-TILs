import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = br.readLine();
        
        int len = str.length();
        while(true) {
            int idx = -1;

            for (int i = 0; i <= len-s.length(); i++) {
                boolean check = true;
                for (int j = 0; j < s.length(); j++) {
                    if (str.charAt(i+j) != s.charAt(j)) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    idx = i;
                    break;
                }
            }

            if (idx == -1) {
                break;
            }

            str = str.substring(0, idx) + str.substring(idx+s.length());
            len = str.length();
        }

        System.out.println(str);
    }
}