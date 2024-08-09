import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, fun(i));
        }

        System.out.println(ans);
    }

    static int fun(int n) {

        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        
        int x2 = 0;
        int y2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                continue;
            }

            int x = arr[i][0];
            int y = arr[i][1];

            x1 = Math.min(x1, x);
            y1 = Math.min(y1, y);

            x2 = Math.max(x2, x);
            y2 = Math.max(y2, y);
        }

        return ((x2 - x1) * (y2 - y1));
    }
}