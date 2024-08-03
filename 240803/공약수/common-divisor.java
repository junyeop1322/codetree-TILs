import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
        }

        for (int i = 1; i <= min; i++) {
            boolean check = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] % i != 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(i);
            }
        }
    }
}