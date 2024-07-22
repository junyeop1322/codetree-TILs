import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 1;

        StringBuilder sb = new StringBuilder();

        while(true) {
            sb.append(num + " ");
            num++;

            if (num > n) {
                break;
            }
        }

        System.out.println(sb);
    }
}