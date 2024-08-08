import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (sum % (1 + j - i) != 0) {
                    continue;
                }

                int avg = (sum / (1 + j - i));
                
                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg) {
                        // System.out.println("i : " + i + ", j : " + j + ", avg : " + avg + ", arr[k] = " + arr[k]);
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}