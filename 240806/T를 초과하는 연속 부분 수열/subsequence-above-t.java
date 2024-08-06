import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        boolean check = false;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > t) {
                check = true;
            }
        }

        if (!check) {
            System.out.println(0);
            return;
        }
        
        int cnt = 1;
        int max = 0;
        int num = arr[0];
        for (int i = 1; i < n; i++) {
            int number = arr[i];
            if (num > t && number > t && num < number) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }

            num = number;
        }
        max = Math.max(cnt, max);

        System.out.println(max);
    }
}