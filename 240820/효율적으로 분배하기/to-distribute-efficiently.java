import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        if (n < 8) {
            if (n % 3 == 0 || n % 5 ==0) {
                if (n % 3 ==0) {
                    System.out.println(n / 3);
                } else {
                    System.out.println(n / 5);
                }
                return;
            } else {
                System.out.println(-1);
                return;
            }
        }

        // 11 12 13 14 15 (3, 4, 3, 4, 3)
        // 16 17 18 19 20 (4, 5, 4, 5, 4)
        if (n % 5 == 0) {
            System.out.println(n / 5);
        } else if (n % 5 == 1 || n % 5 == 3) {
            System.out.println((n / 5) + 1);
        } else {
            System.out.println((n / 5) + 2);
        }
    }
}