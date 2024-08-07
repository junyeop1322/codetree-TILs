import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, bomb(i));
            // System.out.println("i : " + i + " /------------");
        }

        System.out.println(ans);
    }

    static int bomb(int num) {
        int count = 1;
        int cnt = 1;

        int x1 = arr[num];
        int x2 = arr[num];

        boolean chk3 = false;
        boolean chk4 = false;

        while(true) {
            if (chk3 && chk4) {
                break;
            }

            boolean chk1 = false;
            boolean chk2 = false;

            int x = 0;
            int y = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!chk3 && x1+cnt >= arr[i] && x1 < arr[i]) {
                    // System.out.println("arr[i] : " + arr[i] + ", x1 : " + x1);
                    x = Math.max(x, arr[i]);
                    count++;
                    chk1 = true;
                }

                if (!chk4 && x2-cnt <= arr[i] && x2 > arr[i]) {
                    // System.out.println("arr[i] : " + arr[i] + ", x2 : " + x2);
                    y = Math.min(y, arr[i]);
                    count++;
                    chk2 = true;
                }
            }

            if (chk1) {
                x1 = x;
            } else {
                chk3 = true;
            }
            if (chk2) {
                x2 = y;
            } else {
                chk4 = true;
            }

            cnt++;
        }

        return count;
    }
}