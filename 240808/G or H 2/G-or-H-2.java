import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);

            if (ch == 'G') {
                arr[num] = 2;
            } else {
                arr[num] = 1;
            }
        }

        int ans = 0;

        for (int i = 0; i < 101; i++) {
            if (arr[i] != 0) {
                int cnt1 = 0;
                int cnt2 = 0;
                for (int j = i; j < 101; j++) {
                    if (arr[j] == 1) {
                        cnt1++;
                    } else if (arr[j] == 2) {
                        cnt2++;
                    }

                    if (arr[j] != 0 && (cnt1 == cnt2 || (cnt1 != 0 && cnt2 ==0) || (cnt1 == 0 && cnt2 != 0))) {
                        ans = Math.max(ans, j-i);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}