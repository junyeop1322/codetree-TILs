import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[201];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) + 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            if (x != 101 && y != -101) {
                if (x <= y) {
                    for (int j = x+100; j <= y+100; j++) {
                        arr[j]++;
                    }
                }
            }

        }

        int max = 0;
        for (int i = 0; i < 201; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}