import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[b + 1];
        for (int i = 2; i <= b; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= b; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= b; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int ans = 0;

        for (int i = a; i <= b; i++) {
            if (isPrime[i]) {
                ans++;
            }
        }


        System.out.println(ans);
    }

}