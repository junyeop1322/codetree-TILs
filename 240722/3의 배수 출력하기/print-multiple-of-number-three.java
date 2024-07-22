import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int num = 3;
        while(true) {
            if (num > n) {
                break;
            }

            sb.append(num + " ");
            num += 3;
        }

        System.out.println(sb);
    }
}