import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println("one");
            return;
        }

        System.out.println(isPrime(n));
    }

    static String isPrime(int n) {
        String str = "prime";

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                str = "composition";
                break;
            }
        }

        return str;
    }
}