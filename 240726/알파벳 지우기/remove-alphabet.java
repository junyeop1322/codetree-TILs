import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                sb.append(str1.charAt(i));
            }
        }

        sum += Integer.parseInt(sb.toString());

        sb = new StringBuilder();
        String str2 = br.readLine();

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                sb.append(str2.charAt(i));
            }
        }

        sum += Integer.parseInt(sb.toString());

        System.out.println(sum);
    }
}