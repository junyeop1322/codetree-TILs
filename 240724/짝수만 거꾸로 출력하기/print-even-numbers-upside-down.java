import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int t = 0; t < n; t++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0 ) {
                arr[t] = -1;
            } else if (num % 2 == 0) {
                arr[t] = num;
            }
        }

        for (int i = n-1; i >= 0; i--) {
            if (arr[i] != 0) {
                if (arr[i] == -1) {
                    sb.append(0 + " ");
                } else {
                    sb.append(arr[i] + " ");
                }
            }
        }

        System.out.println(sb);
    }
}