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

        if (a < 11) {
            System.out.println(-1);
            return;
        } else if (a == 11){
            if (b < 11) {
                System.out.println(-1);
                return;
            } else if (b == 11) {
                if (c < 11) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        int d = 0;
        int h = 0;
        int m = 0;

        if (b >= 11) {
            d = a - 11;
            h = b - 11;
        } else {
            d = a - 12;
            h = 24 - (11 - b);
        }

        if (c >= 11) {
            m = c - 11;
        } else {
            h--;
            m = 60 - (11 - c);
        }

        System.out.println(m + 60*h + 24*60*d);
    }
}