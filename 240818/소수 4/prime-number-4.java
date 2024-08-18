import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                cnt++;
                
                if (cnt == k) {
                        System.out.println(i);
                        return;
                }
                for (int j = i*i; j <= n; j += i) {
                    if (isPrime[j]) {
                        isPrime[j] = false;
                        cnt++;
                       
                        if (cnt == k) {
                            System.out.println(j);
                            return;
                        }
                    }
                }
                
            }
        }


    }
}