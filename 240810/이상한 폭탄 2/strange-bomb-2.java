import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int max = -1;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int cnt = fun(arr, arr[i], k);

            if (cnt != 1) {
                if (cnt > max) {
                    max = cnt;
                    ans = arr[i];
                }
            }
        }

        System.out.println(ans);
    }

    static int fun(int[] arr, int num, int k) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num-k && arr[i] <= num+k) {
                cnt++;
            }
        }

        return cnt;
    }
}