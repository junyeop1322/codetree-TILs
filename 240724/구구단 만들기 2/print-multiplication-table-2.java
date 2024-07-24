import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 4; i++) {
            for (int j = b; j >= a; j--) {
                sb.append(j + " * " + i*2 + " = " + j*i*2 + " / ");
            }
            sb.delete(sb.length()-2, sb.length());
            sb.append("\n");
        }

        System.out.println(sb);
    }

}