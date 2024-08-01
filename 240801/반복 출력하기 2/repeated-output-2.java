import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        print(n);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("HelloWorld");

        print(n-1);
    }
}