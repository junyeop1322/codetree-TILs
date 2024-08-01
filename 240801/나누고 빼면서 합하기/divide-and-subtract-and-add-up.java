import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findSum(arr, m));
    }

    static int findSum(int[] arr, int m) {
        int sum = 0;

        while(true) {
            if (m == 0) {
                break;
            }

            sum += arr[m-1];

            if (m % 2 == 0) {
                m /= 2;
            } else {
                m--;
            }
        }

        return sum;
    }
}