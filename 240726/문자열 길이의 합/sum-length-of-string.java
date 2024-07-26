import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            sum += str.length();

            if (str.charAt(0) == 'a') {
                cnt++;
            }
        }

        System.out.println(sum + " " + cnt);
    }
}