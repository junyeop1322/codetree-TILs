import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        int num = a;

        while (true) {
            sb.append(num + " ");

            if (num % 2 == 0) {
                num = num+3;
            } else {
                num *= 2;
            }

            if (num > b) {
                break;
            }
        }

        System.out.println(sb);

    }
}