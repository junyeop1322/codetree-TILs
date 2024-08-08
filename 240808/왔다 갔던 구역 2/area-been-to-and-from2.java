import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[10000];

        int x = 5000;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String o = st.nextToken();

            if (o.equals("L")) {
                for (int j = x; j >= x-num; j--) {
                    arr[j]++;
                }
                x = x - num;
            } else {
                for (int j = x; j <= x+num; j++) {
                    arr[j]++;
                }
                x = x + num;
            }
        }


        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10000; i++) {
            if (arr[i] >= 2) {
                cnt++;
            } else {
                if (cnt != 0) {
                    sum += cnt-1;
                    cnt = 0;
                }
            }
        }

        System.out.println(sum);
    }
}