import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        StringBuilder sb = new StringBuilder();

        for (int i = max; i >= min; i--) {
            sb.append(i + " ");
        }

        System.out.println(sb);
    }
}