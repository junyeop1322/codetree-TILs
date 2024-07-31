import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(countPrime(a, b));
    }

    static int countPrime(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            boolean cek = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cek = false;
                    break;
                }
            }

            if (cek && check(i)) {
                cnt++;
            }
        }

        return cnt;

    }

    static boolean check(int num) {
        int sum = 0;

        String str = Integer.toString(num);

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}