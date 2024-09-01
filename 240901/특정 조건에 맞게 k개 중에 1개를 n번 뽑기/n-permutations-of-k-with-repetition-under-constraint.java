import java.io.*;
import java.util.*;

public class Main {

    static int n, k;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        List<int[]> res = new ArrayList<>();
        int[] arr = new int[n];

        comb(0, arr, res);

        for (int[] brr : res) {
            for (int num : brr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    static void comb(int depth, int[] arr, List<int[]> res) {
        if (depth == n) {
            res.add(arr.clone());
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (depth >= 2 && arr[depth - 1] == i && arr[depth - 2] == i) {
                continue;
            }
            arr[depth] = i;
            comb(depth+1, arr, res);
         }
    }


}