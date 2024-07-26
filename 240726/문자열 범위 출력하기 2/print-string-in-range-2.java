import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        int idx = str.length() - 1;

        if (str.length() > n) {
            for (int i = 0; i < n; i++) {
                System.out.print(ch[idx]);
                idx--;
            }
        } else {
            for (int i = str.length()-1; i >= 0; i--) {
                System.out.print(ch[i]);
            }
        }
        
    }
}