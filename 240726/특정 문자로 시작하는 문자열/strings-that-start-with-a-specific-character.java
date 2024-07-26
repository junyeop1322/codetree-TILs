import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String s = br.readLine();
        char ch = s.charAt(0);
        double sum = 0;
        int cnt = 0;;

        for (int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == ch) {
                sum += arr[i].length();
                cnt++;
            }
        }

        System.out.printf("%d %.2f", cnt, sum/cnt);
    }
}