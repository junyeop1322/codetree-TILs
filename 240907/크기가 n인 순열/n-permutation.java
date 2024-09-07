import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        perm(arr, 0);
    }

    static void perm(int[] arr, int depth) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            boolean check = true;
            for (int j = 0; j < depth; j++) {
                if (arr[j] == i) {
                    check = false;
                }
            }

            if (check) {
                arr[depth] = i;
                perm(arr, depth+1);
            }
        }

    }
}