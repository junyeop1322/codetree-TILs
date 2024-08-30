import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        String str = Integer.toString(n);
        int cnt = 0;

        int num = n;

        while (true) {
            int number = 0;
            
            number += (num / 10) + (num % 10);

            // System.out.println(number);

            String strA = Integer.toString(number);
            int a = strA.charAt(strA.length() - 1) - '0';

            String strB = Integer.toString(num);
            int b = strB.charAt(strB.length() - 1) - '0';

            // System.out.println("A : " + a + ", B :" + b);
            
            num = a + 10 * b;
            cnt++;

            if (num == n) {
                break;
            }
        }

        System.out.println(cnt);
    }
}