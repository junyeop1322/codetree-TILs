import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        if (a > b) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }

        if (a > c) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }

        if (a > d) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }

        if (a > e) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }



        System.out.println(sb);
    }
}