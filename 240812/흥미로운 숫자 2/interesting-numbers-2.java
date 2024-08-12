import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int ans = 0;

        for (int i = x; i <= y; i++) {
            ans += func(i);
        }

        System.out.println(ans);
    }

    static int func(int num) {
        int ans = 0;

        String str = Integer.toString(num);
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        int cnt = 0;
        boolean check = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                cnt++;
            }

            if (arr[i] == 1) {
                check = true;
            }
        }

        if (cnt == 2 && check) {
            ans = 1;
        }
        
        return ans;
    }
}