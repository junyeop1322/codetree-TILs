import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int h = 0;
        int m = 0;

        if (d - b >= 0) {
            h = c - a;
            m = d - b;
        } else {
            h = c - a - 1;
            m = 60 - (b - d);
        }

        System.out.println(m + 60*h);
    }
}