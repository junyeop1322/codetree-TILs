import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(find369(n, m));
    }

    static int find369(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                cnt++;
            } else {
                String str = Integer.toString(i);

                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    if (ch == '3' || ch == '6' || ch == '9') {
                        cnt++;
                        break;
                    }
                }
            }
        }

        return cnt;
    }
}