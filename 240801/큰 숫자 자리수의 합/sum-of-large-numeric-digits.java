import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(st.nextToken());
        }

        System.out.println(sum(num));
    }

    static int sum(int n) {
        if (n < 10) {
            return n;
        }

        return (n % 10) + sum((n/10));
    }
}