import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int num = 1;
        char ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                if (j < n-i) {
                    sb.append(ch + " ");
                    ch = (char)((int)ch + 1);
                    if (ch > 'Z') {
                        ch = 'A';
                    }
                } else {
                    sb.append(num + " ");
                    num++;
                    if (num > 9) {
                        num = 1;
                    }
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}