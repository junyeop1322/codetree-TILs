import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        int cnt = 0;

        int num = Math.abs(a-b);

        if (a < b) {
            while (true) {
                if ((int)Math.pow(2, cnt) >= num) {
                    break;
                }
            cnt += 2;
            }
        } else {
            cnt = 1;
            while (true) {
                if ((int)Math.pow(2, cnt) >= num) {
                    break;
                }
            cnt += 2;
            }
        }
        

        for (int i = 0; i < cnt; i++) {
            ans += (int)Math.pow(2, i);
        }

        ans += (int)Math.pow(2, cnt-1) + Math.abs(b-a);


        System.out.println(ans);
    }
}