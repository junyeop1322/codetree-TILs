import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[2*n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 2*n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr[i] + arr[2 * n - 1 - i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);

    }
}