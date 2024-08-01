import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        print(a, b);
    }

    static void print(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        System.out.println(min*2 + " " + (max+25));
    }
}