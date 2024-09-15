import java.io.*;
import java.util.*;

public class Main {

    static int n, m, k;
    static int[] turns;
    static int[] moveArr;
    static int[] arr;

    static int ans;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        turns = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            turns[i] = Integer.parseInt(st.nextToken());
        }

        arr = new int[n];
        perm(0);

        System.out.println(ans);
    }

    static void perm(int cnt) {
        if (cnt == n) {
            calculate();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr[cnt] = i;
            perm(cnt+1);
        }
    }

    static void calculate() {
        int score = 0;
        moveArr = new int[k+1];

        for (int i = 0; i < n; i++) {
            moveArr[arr[i]] += turns[i];
        }

        for (int i = 1; i <= k; i++) {
            if (moveArr[i] >= m-1) {
                score++;
            }
        }

        ans = Math.max(ans, score);
    }
}