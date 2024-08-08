import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] brr = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(brr);
        int ans = 0;

        for (int i = 0; i <= n-m; i++) {
            int[] crr = new int[m];
            int cnt = 0;
            for (int j = i; j < i+m; j++) {
                crr[cnt] = arr[j];
                cnt++;
            }

            Arrays.sort(crr);

            boolean check = true;

            for (int j = 0; j < m; j++) {
                if (brr[j] != crr[j]) {
                    check = false;
                    break;
                }
            } 

            if (check) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}