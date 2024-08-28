import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        comb(k, n, new int[n], 0);
    }

    public static void comb(int K, int N, int[] arr, int index) {
        if (index == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            arr[index] = i;
            comb(K, N, arr, index + 1);
        }
    }
}