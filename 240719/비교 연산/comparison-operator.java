import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a >= b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
        if (a > b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
        if (a <= b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
        if (a < b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
        if (a == b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
        if (a != b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }

        System.out.println(sb);
    }
}