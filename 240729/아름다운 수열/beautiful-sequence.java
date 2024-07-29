import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            brr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, brr[i]);
        }
        for (int i = 0; i < m; i++) {
            brr[i] = brr[i] - min;
        }
        Arrays.sort(brr);

        if (m > n) {
            System.out.println(0);
            return;
        }

        int cnt = 0;

        for (int i = 0; i <= n-m; i++) {
            int[] crr = new int[m];
            int idx = 0;
            min = Integer.MAX_VALUE;
            for (int j = i; j < i+m; j++) {
                crr[idx] = arr[j];
                min = Math.min(min, arr[j]);
                idx++;
            }
            for (int j = 0; j < m; j++) {
                crr[j] = crr[j] - min;
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
                cnt++;
                sb.append(i+1 + "\n");
            }

        }

        System.out.println(cnt);
        System.out.println(sb);

    }
}