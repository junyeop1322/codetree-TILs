import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int cnt = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());

        arr = new int[n];

        func(0);

        System.out.println(cnt);
    }

    static void func(int num) {
        if (num == n) {
            cnt++;
        } else {
            for (int i = 1; i <= 4; i++) {
                if (num + i > n) {
                    return;
                }

                for (int j = 0; j < i; j++) {
                    arr[num + j] = i;
                }
                func(num + i);
            }
        }
    }

}