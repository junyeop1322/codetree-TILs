import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}