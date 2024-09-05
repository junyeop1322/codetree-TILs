import java.io.*;
import java.util.*;

public class Main {

    static int n, m;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] out = new int[m];

        comb(out, 1, 0);
    }

    static void comb(int[] out, int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(out[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            out[depth] = i;
            comb(out, i+1, depth+1);
        }
    }
}