import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int a = 1;

        while(true) {
            if (cnt == 2) {
                break;
            }
            int num = n * a;
            sb.append(num + " ");
            a++;
            if (num % 5 == 0) {
                cnt++;
            }
        }

        System.out.println(sb);
    }
}