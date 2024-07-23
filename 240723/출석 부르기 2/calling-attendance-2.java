import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 1) {
                sb.append("John\n");
            } else if (num == 2) {
                sb.append("Tom\n");
            } else if (num == 3) {
                sb.append("Paul\n");
            } else if (num == 4) {
                sb.append("Sam\n");
            } else {
                sb.append("Vacancy\n");
                break;
            }
        }

        System.out.println(sb);
    }
}