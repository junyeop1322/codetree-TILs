import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(fun(arr, price, n)-1);

    }

    static int fun(int[] arr, int p, int n) {
        int cnt = 0;

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (p < 0) {
                break;
            }

            if (i == idx) {
                p -= arr[i]/2;
            } else {
                p -= arr[i];
            }

            idx++;
            cnt++;
        }

        return cnt;
    }
}