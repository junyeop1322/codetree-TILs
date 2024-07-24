import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n % 3 == 0) {
                break;
            } else {
                num = n;
            }
        }
        System.out.println(num);
    }
}