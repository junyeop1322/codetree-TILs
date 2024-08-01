import java.io.*;
import java.util.*;

public class Main {
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());

        sumsum(n);

        System.out.println(sum);
    }

    static void sumsum(int n) {
        if (n == 0) {
            return;
        }

        sum += n;

        sumsum(n-1);
    }
}