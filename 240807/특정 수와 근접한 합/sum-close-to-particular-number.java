import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        sum += arr[k];
                    }
                }

                min = Math.min(min, Math.abs(s - sum));
            }
        }

        System.out.println(min);
    }
}