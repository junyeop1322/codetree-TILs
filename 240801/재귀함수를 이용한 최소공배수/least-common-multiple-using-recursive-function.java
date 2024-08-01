import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int pro = 1;

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            pro *= arr[i];
        }

        Arrays.sort(arr);

        for (int i = arr[n-1]; i <= pro; i++) {
            boolean check = true;
            for (int j = 0; j < n; j++) {
                if (i % arr[j] != 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(i);
                break;
            }
        }
    }
}