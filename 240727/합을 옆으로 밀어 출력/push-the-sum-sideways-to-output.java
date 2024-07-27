import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        String s = Integer.toString(sum);

        String str = "";

        for (int i = 1; i < s.length(); i++) {
            str += s.charAt(i);
        }
        str += s.charAt(0);

        System.out.println(str);
    }
}