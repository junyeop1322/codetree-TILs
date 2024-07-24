import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        while(true) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 0) {
                break;
            }

            if (cnt == 0) {
                a = num;
            } else if (cnt == 1) {
                b = num;
            } else {
                c = num;
            }
            cnt++;
            if (cnt == 3) {
                cnt = 0;
            }
        }

        System.out.println(a + b + c);

    }
}