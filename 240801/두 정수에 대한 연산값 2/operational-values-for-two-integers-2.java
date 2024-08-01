import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        print(n, m);
    }

    static void print(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if (a == min) {
            System.out.println((min+10) + " " + max*2);
        } else {
            System.out.println(max*2 + " " + (min+10));
        }
    }
}