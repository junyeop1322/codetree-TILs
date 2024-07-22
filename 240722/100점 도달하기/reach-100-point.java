import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i <= 100; i++) {
            String str;

            if (i >= 90) {
                str = "A";
            } else if (i >= 80) {
                str = "B";
            } else if (i >= 70) {
                str = "C";
            } else if (i >= 60) {
                str = "D";
            } else {
                str = "F";
            }

            sb.append(str + " ");
        }

        System.out.println(sb);
    }
}