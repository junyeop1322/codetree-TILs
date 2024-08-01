import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        count(n, 0);
    }

    static void count(int num, int cnt) {
        if (num == 1) {
            System.out.println(cnt);
            return;
        }
        int n = 0;

        if (num % 2 ==0) {
            n = num / 2;
        } else {
            n = num / 3;
        }

        count(n, cnt+1);
        
    }
}