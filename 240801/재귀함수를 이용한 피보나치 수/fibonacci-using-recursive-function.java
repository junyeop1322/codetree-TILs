import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        if (n <= 2) {
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
}