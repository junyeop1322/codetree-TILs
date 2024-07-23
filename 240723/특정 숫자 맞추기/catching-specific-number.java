import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 25) {
                sb.append("Good\n");
                break;
            } else if (num < 25) {
                sb.append("Higher\n");
            } else if (num > 25) {
                sb.append("Lower\n");
            }
        }

        System.out.println(sb);
    }
}