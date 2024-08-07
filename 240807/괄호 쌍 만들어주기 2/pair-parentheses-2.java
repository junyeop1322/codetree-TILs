import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt = 0;
        if (str.length() < 4) {
            System.out.println(cnt);
            return;
        }

        for (int i = 0; i < str.length()-3; i++) {
            for (int j = i+2; j < str.length()-1; j++) {
                if (str.charAt(i) == '(' && str.charAt(i+1) == '(' && str.charAt(j) == ')' && str.charAt(j+1) == ')') {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}