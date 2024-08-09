import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int cnt = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean isPrime (int num) {
        if (num == 1) {
            return false;
        }

        boolean check = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        return check;
    }
}