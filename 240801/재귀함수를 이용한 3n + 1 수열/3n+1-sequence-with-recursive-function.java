import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        findCount(n, 0);
    }

    static void findCount(int n, int cnt) {
        if (n == 1) {
            System.out.println(cnt);
            return;
        }

        if (n % 2 == 0) {
            findCount(n/2, cnt+1);
        } else {
            findCount(n*3+1, cnt+1);
        }
    }
}