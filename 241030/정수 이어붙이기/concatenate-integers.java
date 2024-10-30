import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] num = new int[k];

        for (int i = 0; i <= n-k; i++) {
            num[0] = arr[i];
            getNum(arr, num, 1, i+1);
        }


        System.out.println(set.size());
    }

    static void getNum(int[] arr, int[] num, int idx, int start) {
        if (idx == k) {
            boolean[] check = new boolean[k];
            int[] ans = new int[k];
            createNum(num, ans, check, 0);
            return;
        }

        for (int i = start; i < n; i++) {
            num[idx] = arr[i];
            getNum(arr, num, idx+1, i+1);
        }

    }

    static void createNum(int[] num, int[] ans, boolean[] check, int cnt) {
        if (cnt == k) {
            String str = "";
            for (int i = 0; i < k; i++) {
                str += Integer.toString(ans[i]);
            }
            set.add(Integer.parseInt(str));
            return;
        }

        for (int i = 0; i < k; i++) {
            if (!check[i]) {
                check[i] = true;
                ans[cnt] = num[i];
                createNum(num, ans, check, cnt+1);
                check[i] = false;
            }
        }

    }


}