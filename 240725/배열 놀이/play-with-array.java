import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                int a = Integer.parseInt(st.nextToken());

                sb.append(arr[a] + "\n");
            } else if (num == 2) {
                int b = Integer.parseInt(st.nextToken());

                int idx = 0;
                for (int j = 1; j <= n; j++) {
                    if (arr[j] == b) {
                        idx = j;
                        break;
                    }
                }

                sb.append(idx + "\n");
            } else {
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());

                for (int j = s; j <= e; j++) {
                    sb.append(arr[j] + " ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}