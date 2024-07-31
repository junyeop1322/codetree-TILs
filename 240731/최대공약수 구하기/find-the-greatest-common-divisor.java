import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(gcd(n, m));
    }

    static int gcd(int n, int m) {
        int num = 0;

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                num = i;
                break;
            }
        }

        return num;
    }
}