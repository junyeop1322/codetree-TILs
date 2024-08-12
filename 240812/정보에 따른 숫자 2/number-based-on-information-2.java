import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int t = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        arr = new int[1001];
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char ch = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());

            if (ch == 'S') {
                arr[num] = 1;
            } else {
                arr[num] = 2;
            }
        }

        int ans = 0;

        for (int i = a; i <= b; i++) {
            ans += func(i);
        }

        System.out.println(ans);
    }

    static int func(int n) {
        int num = 0;

        int d1 = Integer.MAX_VALUE;
        int d2 = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            if (arr[i] == 1) {
                d1 = n - i;
            } else if (arr[i] == 2) {
                d2 = n - i;
            }
        }

        for (int i = n; i < 1001; i++) {
            if (arr[i] == 1) {
                d1 = Math.min(d1, i-n);
                break;
            }
        }

        for (int i = n; i < 1001; i++) {
            if (arr[i] == 2) {
                d2 = Math.min(d2, i-n);
                break;
            }
        }

        if (d1 <= d2) {
            num = 1;
        }

        return num;
    }
}