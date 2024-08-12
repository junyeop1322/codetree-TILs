import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;
    static int n, c, g, h;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < 1001; i++) {
            ans = Math.max(ans, func(i));
        }

        System.out.println(ans);
    }

    static int func(int num) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = arr[i][0];
            int y = arr[i][1];

            if (num < x) {
                sum += c;
            } else if (num > y) {
                sum += h;
            } else {
                sum += g;
            }
        }

        return sum;
    }
}