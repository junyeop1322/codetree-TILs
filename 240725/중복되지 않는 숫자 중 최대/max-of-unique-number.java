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
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int max = -1;

        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        for (int i = n-1; i >= 0; i--) {
            if (i > 0 && i < n-1) {
                if (arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
                    max = arr[i];
                    break;
                }
            } else if (i == n-1) {
                if (arr[i] != arr[i-1]) {
                    max = arr[i];
                    break;
                }
            } else if (i == 0) {
                if (arr[i] != arr[i+1]) {
                    max = arr[i];
                    break;
                }
            }
        }

        System.out.println(max);
    }
}