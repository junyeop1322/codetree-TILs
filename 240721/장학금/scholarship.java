import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int ans = 0;

        int mid = Integer.parseInt(st.nextToken());
        int fin = Integer.parseInt(st.nextToken());

        if (mid >= 90) {
            if (fin >= 95) {
                ans = 10;
            } else if (fin >= 90) {
                ans = 5;
            }
        }

        System.out.println(ans);
    }
}