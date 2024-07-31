import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
            num += str.charAt(i) - '0';
        }

        sb.append(" " + num);

        System.out.println(sb);
    }
}