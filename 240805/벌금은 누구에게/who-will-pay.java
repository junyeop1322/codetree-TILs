import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(br.readLine()) - 1;

            arr[num]++;
            if (arr[num] == k) {
                System.out.println(num+1);
                return;
            }
        }

        System.out.println(-1);
    }
}